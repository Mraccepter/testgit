package temp;

public class Test {
	
	public Test(double[][] array){
		System.out.println("arry");
	}
	public Test(Object o){
		System.out.println("object");
	}
	
	
	public static void main(String args[]){
		Test t=new Test(null);
		Object obj = new Object();
		System.out.println(obj instanceof String);
	}

}
