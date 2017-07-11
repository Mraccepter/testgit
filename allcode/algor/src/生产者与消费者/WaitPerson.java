package 生产者与消费者;

class WaitPerson implements Runnable{

	private Restaurant rest;
	public WaitPerson(Restaurant r){
		this.rest = r;
	}
	public void run(){
		try{
			while(!Thread.interrupted()){
				synchronized (this) {
					while(rest.meal == null)
						wait();
				}
				System.out.println("waitperson got" + rest.meal);
				synchronized (rest.chef) {
					rest.meal = null;
					rest.chef.notifyAll();
				}
			}
		}catch(InterruptedException e){
			System.out.println("waitperson interrupted");
		}
	}
		
}

class Chef implements Runnable{
	private Restaurant rest;
	private int count = 0;
	public Chef(Restaurant r) {
		this.rest = r;
	}
	public void run(){
		try{
			while(!Thread.interrupted()){
				synchronized (this) {
					while(rest.meal != null){
						wait();
					}
				}
				if(++count == 10){
					System.out.println("out of food, closing");
					rest.exec.shutdownNow();
				}
				System.out.println("order up");
				synchronized (rest.waitPerson) {
					rest.meal = new Meal(count);
					rest.waitPerson.notifyAll();
				}
			}
			
		}
	}
}
