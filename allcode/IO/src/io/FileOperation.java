package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperation {

	public static String read(String filename) throws IOException{
		BufferedReader in = new BufferedReader(new FileReader(filename));
		String s ;
		StringBuilder sb = new StringBuilder();
		BufferedWriter bw = new BufferedWriter(new FileWriter("fff"));
		while((s = in.readLine()) != null){
//			sb.append(s + "\n");
			bw.write(s);
		}
		
		in.close();
		bw.close();
		return sb.toString();
	}
	
	
	public static void main(String[] args) throws IOException{
		System.out.println(read("test"));
	}
}
