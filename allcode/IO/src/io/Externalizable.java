package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

//使用Externalizable来进行序列化过程得控制，它代替实现了Serializable接口
class Blip1 implements java.io.Externalizable
{
	public Blip1()
	{
		System.out.println("Blip1 constructor");
	}
	@Override
	public void readExternal(ObjectInput arg0) throws IOException, ClassNotFoundException {
		System.out.println("Blip1.readExternal");
		
	}
	@Override
	public void writeExternal(ObjectOutput arg0) throws IOException {
		System.out.println("Blip1.writeExternal");
		
	}
}

class Blip2 implements java.io.Externalizable
{
	public Blip2()
	{
		System.out.println("Blip2 constructor");
	}
	@Override
	public void readExternal(ObjectInput arg0) throws IOException, ClassNotFoundException {
		System.out.println("Blip2.readExternal");
		
	}
	@Override
	public void writeExternal(ObjectOutput arg0) throws IOException {
		System.out.println("Blip2.writeExternal");
		
	}
}

public class Externalizable {
	
	public static void main(String[] args) throws IOException {
		System.out.println("Consturcting objects:");
		
		Blip1 b1 =new Blip1();
		Blip2 b2 = new Blip2();
		
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Blip1.out"));
		System.out.println("Saving objcest:");
		
		out.writeObject(b1);
		out.close();
		
		ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("Blip2.out"));
		
		System.out.println("Saving object");
		out.writeObject(b2);
		
		
		
	}
	
}
