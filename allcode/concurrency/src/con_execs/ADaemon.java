package con_execs;
//
import java.util.concurrent.TimeUnit;

class Daemon implements Runnable{

	public void run()
	{
		try{
		System.out.println("starting ADaemon");
		TimeUnit.SECONDS.sleep(1);
		}catch(InterruptedException e)
		{
			System.out.println("exit ");
		}finally{
			System.out.println("this should always run?");
		}
	}
}
public class ADaemon 
{
	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread(new Daemon());
		t.setDaemon(true);
		t.start();
		TimeUnit.SECONDS.sleep(2);
	}
}