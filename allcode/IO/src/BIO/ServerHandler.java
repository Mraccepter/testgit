package BIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerHandler implements Runnable{

	private Socket socket;
	public ServerHandler(Socket socket){
		this.socket = socket;
	}
	@Override
	public void run() {
		BufferedReader in = null;
		PrintWriter out = null;
		try{
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream());
			String expression;
			String result;
			while(true){
				if((expression = in.readLine()) == null)
					break;
				System.out.println("�������յ���Ϣ��" + expression);
				try{
					result = expression.toString();
				}catch(Exception e){
					result = "�������" + e.getMessage();
				}
				out.println(result);
			}
		}catch(Exception e){
				e.printStackTrace();
			}finally{
				//һЩ��Ҫ����������
				if(in != null){
					try{
						in.close();
					}catch(IOException e){
						e.printStackTrace();
					}
					in = null;
				}
				if(socket != null){
					try{
						socket.close();
					}catch(IOException e){
						e.printStackTrace();
					}
					socket = null;
				}
			}
		}
}