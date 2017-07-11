package GC;
//������Java�����ʹ�õĲ��Ǽ����㷨������Ҫ��ԭ���������ѽ������֮��Ļ�����������
public class ReferenceCountingGC {
	
	public Object instance = null;
	private static final int _1MB = 1024 * 1024;
	
	private byte[] bigsize = new byte[2 * _1MB];
	
	public static void testGC()
	{
		ReferenceCountingGC objA = new ReferenceCountingGC();
		ReferenceCountingGC objB = new ReferenceCountingGC();
		
		objA.instance = objB;
		objB.instance = objA;
		
		objA = null;
		objB = null;
		
		System.gc();
	}
}
