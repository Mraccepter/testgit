package loader;
//���ø���ľ�̬�ֶβ����ʼ������
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