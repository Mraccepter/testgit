package loader;
//调用父类的静态字段不会初始化子类
 class SuperClass{
static {
	System.out.println("Superclass init!");
}
public static int value = 123;
}
 class SubClass extends SuperClass
 {
	 static{
		 System.out.println("subclass init");
	 }
 }
public class LoadTest {
public static void main(String[] args) {
	//System.out.println(SubClass.value);
	
	SuperClass[] sca = new SuperClass[10];
}
}
