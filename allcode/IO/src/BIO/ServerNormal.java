package BIO;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * BIO服务端源码
 * 
 * */
public final class ServerNormal {

	//默认的端口
	private static int DEFAULT_PORT = 12345;
	//单例的serverSocket
	private static ServerSocket server = null;
	
	public static void start() throws IOException{
		//使用默认值
		start(DEFAULT_PORT);
	}
	//
	public synchronized static void start(int port) throws IOException{
		if(server != null) return;
		try{
			server = new ServerSocket(port);
			System.out.println("服务器已启动，端口号：" + port);
			//通过无限循环监听客户端连接
			while(true){
				Socket socket = server.accept();
				//当有新的客户端接入时，会执行下面的代码
				//然后创建一个新的线程处理这条socket链路
				new Thread(new ServerHandler(socket)).start();;
			}
		}finally{
			if(server != null){
				System.out.println("服务器已关闭");
				server.close();
				server = null;
			}
		}
	}
}
