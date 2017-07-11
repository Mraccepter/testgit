//局部变量需要初始化，而实例变量不初始化则使用默认值
public class Main11 {

	private int a;
	public int b = 0;
	String s;
	//如果是String类型呢
	public Main11(){
		a = a + 2;
		b = b + 2;
	}
	public static void main(String[] args) {
		
		Main11 m = new Main11();
		System.out.println(m.a + " " + m.b + " " +  m.s);
		//局部变量需要初始化
		String ss;
//		System.out.println(ss);
		int a;
//		System.out.println(a);
	}
}
