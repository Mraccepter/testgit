package NIO;

import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
/*
 * ����channel��ʹ��
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
		//һ������read����ByteBuffer�洢�ֽڣ��ͱ�����û������ϵ�flip��������������
		//�ñ��˶�ȡ�ֽڵ�׼�������������ڻ�ȡ����ٶ�
		buff.flip();
		while(buff.hasRemaining()){
			System.out.println((char)buff.getChar());
		}
	}
}
