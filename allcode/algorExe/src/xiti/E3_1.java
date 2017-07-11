package xiti;

import java.util.Scanner;

public class E3_1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String a = s.nextLine();
		char[] c = a.toCharArray();
		int flag = 0;
		int n = c.length;
		if(n == 0 || n > 80)
			System.exit(0);
		int sum = 0;
		for(int i = 0; i < n; i++){
			if(c[i] == 'O'){
				flag++;
				sum += flag;
			}else{
				flag = 0;
			}
		}
		System.out.println(sum);
	}
}
