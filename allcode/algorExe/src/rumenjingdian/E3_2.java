package rumenjingdian;

import java.util.Scanner;

public class E3_2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//保证可以一直输入，如果要结束可以用一个字符串作为结束标志
		while(s.hasNext()){
		String a = s.nextLine();
		char[] c = a.toCharArray();
		for(int i = 0; i < c.length; i++){
			if(c[i] == 'o')
				c[i] = 'i';
		}
		System.out.println(String.valueOf(c));
		}
	}
}
