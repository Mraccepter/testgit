package 数组;

import java.util.Scanner;

//两个整数字符串求和
public class TwoStringSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		if(!s1.matches("[0-9]*") || !s2.matches("[0-9]*"))
			return;
		int flag = 0;
		int n1 = s1.length();
		int n2 = s2.length();
		int n = Math.min(n1, n2);
	}
}
