package BIO;

import java.io.IOException;
import java.util.Random;

/*
 * ���Է���
 */
public class Test {

	public static void main(String[] args) throws InterruptedException{
		//���з�����
		new Thread(new Runnable(){
			public void run() {
				try{
					ServerNormal.start();
				}catch(IOException e){
					e.printStackTrace();
				}
			};
		}).start();
		//����ͻ������ڷ��������������д���
		Thread.sleep(100);
		Random random = new Random(System.currentTimeMillis());
		new Thread(new Runnable(){
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(true){
					String expression = random.nextInt(10) + "";
					Clinet.send(expression);
					try{
						Thread.currentThread().sleep(100);
					}catch(InterruptedException e){
						e.printStackTrace();
					}
				}
			}
		}).start();
	}
}
