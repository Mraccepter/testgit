package xiti;

import java.util.Scanner;

public class E3_2 {

	public static double weight(char c){
		switch (c){
		case 'C': return 12.01;
		case 'H': return 1.008;
		case 'O': return 16.00;
		case 'N': return 14.01;
		default : return 0;
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char[] c = s.nextLine().toCharArray();
		double sum = 0;
		if(c[0] < 65){
			System.out.println("首字符不能为数字");
			return;
		}
		for(int i = 0; i < c.length - 1; i++){
			if( 48 < c[i+1] && c[i+1] <= 57){
				sum = sum + weight(c[i]) * (c[i+1] - 48);
			}else{
				sum += weight(c[i]);
			}
		}
		sum += weight(c[c.length-1]);
		System.out.println(sum);
	}
}
