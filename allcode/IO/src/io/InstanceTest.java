package io;
interface A{}
class B implements A{
	
}
public class InstanceTest extends B{

	public static void main(String[] args) {
		A a = null;
		B b = new B();
		InstanceTest i = new InstanceTest();
		System.out.println(b instanceof A);
		System.out.println(b instanceof B);
		System.out.println(b instanceof InstanceTest);
	}
}
