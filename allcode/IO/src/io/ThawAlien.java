package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
//�����л����ݶ���
public class ThawAlien {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(new File("temp")));
		
		Object my =  in .readObject();
		
	    System.out.println(my.getClass());
	}
}
