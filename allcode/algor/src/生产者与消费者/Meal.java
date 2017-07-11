package 生产者与消费者;

public class Meal {
	private final int orderNum;
	public Meal(int orderNum){
		this.orderNum = orderNum;
	}
	public String toString(){
		return "Meal " + orderNum;
	}
}
