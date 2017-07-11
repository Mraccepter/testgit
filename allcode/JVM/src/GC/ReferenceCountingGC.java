package GC;
//主流的Java虚拟机使用的不是计算算法，最主要的原因是它很难解决对象之间的互相引用问题
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
