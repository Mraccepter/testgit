package ��ʼ��;
//���ھ�̬�ֶΣ�ֻ��ֱ�Ӷ�������ֶε���Żᱻ��ʼ����
//��ˣ�ͨ�������������ø����ж���ľ�̬�ֶΣ�ֻ�ᴥ������ĳ�ʼ�������ᴥ������ĳ�ʼ��
//��̬�����;�̬�����ĳ�ʼ���������ڳ����е�˳��ִ��
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
