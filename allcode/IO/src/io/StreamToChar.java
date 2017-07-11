package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class StreamToChar {

	public static void main(String[] args)  throws IOException {
		String file = "d:/stream.txt";
		String charset = "UTF-8";
		//д�ַ�ת���ַ���
		FileOutputStream outputStream = new FileOutputStream(file);
		OutputStreamWriter writer = new OutputStreamWriter(outputStream,charset);
		try{
			writer.write("����Ҫ����������ַ�");
		}finally{
			writer.close();
		}
		//��ȡ�ֽ�ת���ַ�
		FileInputStream inputStream = new FileInputStream(file);
		InputStreamReader reader = new InputStreamReader(inputStream, charset);
		int count = 0;
		char[] buf = new char[64];
		StringBuffer buffer = new StringBuffer();
		try{
			while((count = reader.read(buf)) != -1){
				buffer.append(count);
			}
		}finally{
			System.out.println(buffer.toString());
			reader.close();
		}
	}
	
	
}
