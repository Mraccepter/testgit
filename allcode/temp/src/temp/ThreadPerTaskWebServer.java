package temp;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;

public class ThreadPerTaskWebServer {
	public static void main(String[] args) throws IOException {
		ServerSocket socket = new ServerSocket(8888);
		while(true){
			final Socket connection = socket.accept();
			Runnable task = new Runnable(){
				public void run(){
					handleRequest(connection);
				}
			};
			new Thread(task).start();
			LinkedList l = new LinkedList();
			String
		}
	}
}
