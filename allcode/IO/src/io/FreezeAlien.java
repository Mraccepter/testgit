package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FreezeAlien {

		public static void main(String[] args) throws FileNotFoundException, IOException {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("temp"));
			
			Alien a =new Alien();
			
			out.writeObject(a);
			
		}
}
