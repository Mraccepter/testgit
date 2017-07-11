package NIO;

import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
/*
 * 关于channel的使用
 */
public class GetChannel {

	private static final int BSIZE = 1024;
	public static void main(String[] args) throws Exception{
		FileChannel fc = new FileOutputStream("data.txt").getChannel();
		fc.write(ByteBuffer.wrap("some text".getBytes()));
		fc.close();
		fc = new RandomAccessFile("data.txt", "rw").getChannel();
		ByteBuffer buff = ByteBuffer.allocate(BSIZE);
		fc.read(buff);
		//一旦调用read来向ByteBuffer存储字节，就必须调用缓冲器上的flip函数，让它做好
		//让别人读取字节的准备，这样适用于获取最大速度
		buff.flip();
		while(buff.hasRemaining()){
			System.out.println((char)buff.getChar());
		}
	}
}
