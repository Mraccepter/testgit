package BIO;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * BIO�����Դ��
 * 
 * */
public final class ServerNormal {

	//Ĭ�ϵĶ˿�
	private static int DEFAULT_PORT = 12345;
	//������serverSocket
	private static ServerSocket server = null;
	
	public static void start() throws IOException{
		//ʹ��Ĭ��ֵ
		start(DEFAULT_PORT);
	}
	//
	public synchronized static void start(int port) throws IOException{
		if(server != null) return;
		try{
			server = new ServerSocket(port);
			System.out.println("���������������˿ںţ�" + port);
			//ͨ������ѭ�������ͻ�������
			while(true){
				Socket socket = server.accept();
				//�����µĿͻ��˽���ʱ����ִ������Ĵ���
				//Ȼ�󴴽�һ���µ��̴߳�������socket��·
				new Thread(new ServerHandler(socket)).start();;
			}
		}finally{
			if(server != null){
				System.out.println("�������ѹر�");
				server.close();
				server = null;
			}
		}
	}
}
