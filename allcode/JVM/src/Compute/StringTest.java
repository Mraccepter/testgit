package Compute;

public class StringTest {
	
	public static void main(String[] args) {
		String str = "hellow world";
		//这行有错，字符型为单个字符
		//str += ' a';
		int strlen = str.length();
		
		str = str + 100;
		
	}
}
