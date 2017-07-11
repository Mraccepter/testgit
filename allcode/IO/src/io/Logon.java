package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;
import java.util.concurrent.TimeUnit;
//序列化的控制，使用transient关键字
public class Logon implements Serializable{

		private Date date = new Date();
		
		private String username;
		
		private transient String password;
		
		public Logon(String name ,String pwd) {
			this.username = name ;
			this.password = pwd;
			
		}
		public String toString()
		{
			return "logon info: \n   username : " + username +"\n date : " + date + 
					"\n password : " + password;
		}
		public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException, ClassNotFoundException {
			Logon a = new Logon("hulk", "1234");
			System.out.println("logon a = " + a );
			
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("logon.out"));
			
			out.writeObject(a);
			
			out.close();
			
			TimeUnit.SECONDS.sleep(1);
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("logon.out"));
			
			System.out.println("recovering objcet at " + new Date());
			
			a = (Logon)in.readObject();
			
			System.out.println("logon a = " + a);
		}
}
