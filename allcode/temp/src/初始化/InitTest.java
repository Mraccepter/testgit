package 初始化;
//对于静态字段，只有直接定义这个字段的类才会被初始化，
//因此，通过其子类来引用父类中定义的静态字段，只会触发父类的初始化而不会触发子类的初始化
//静态变量和静态代码块的初始化按照其在程序中的顺序执行
class SuperClass{
	public static SuperClass value = new SuperClass();
	static{
		System.out.println("superclass init");
	}
	
	public SuperClass() {
		System.out.println("aaa");
	}
	public static int i = 123;
}
class SubClass extends SuperClass{
	static {
		System.out.println("Subclass init");
	}
}
public class InitTest {

	public static void main(String[] args) {
//		System.out.println(SubClass.i);
		new SubClass();
	}
}
