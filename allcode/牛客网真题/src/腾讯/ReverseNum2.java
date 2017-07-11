package ÌÚÑ¶;

import java.util.Scanner;

public class ReverseNum2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] ch = s.toCharArray();
		int len = ch.length;
		int a=0, b=0, c=0, d=0;
		int count = 0;
		for(int i = len-1; i >= 0; i--){
			if(ch[i] == 'D'){
				count += len-1-i-d;
				d++;
			}
			else if(ch[i] == 'C'){
				count += len-1-i-c-d;
				c++;
			}
			else if(ch[i] == 'B'){
				count += len-1-i-d-c-b;
				b++;
			}
		}
		System.out.println(count);
	}
	
}
