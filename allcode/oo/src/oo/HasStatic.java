package oo;
//ע���ʱ�����ھ�̬������˽������Ҳ���Է���
public class HasStatic {
	//
	private static int x = 100;
	public static void main(String[] args) {
		HasStatic hs1 = new HasStatic();
		hs1.x++;
		HasStatic hs2 = new HasStatic();
		hs2.x++;
		System.out.println("x=" +x);
	}
}
