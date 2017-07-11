package oo;
//注意输出结果为base
public class Base {

	private static String baseName = "base";
	public Base(){
		callName();
	}
	public static void callName(){
		System.out.println(baseName);
	}
	static class Sub extends Base{
		private static String baseName = "sub";
		public static void callName(){
			System.out.println(baseName);
		}
	}
	public static void main(String[] args) {
		Base b = new Sub();
	}
}
