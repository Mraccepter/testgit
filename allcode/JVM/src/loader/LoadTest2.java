package loader;

class ConstClass
{
	static{
		System.out.println("constClass init");
	}
	public static final String HELLO = "hello";
}
public class LoadTest2 {
public static void main(String[] args) {
	System.out.println(ConstClass.HELLO);
}
}
