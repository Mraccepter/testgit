package 网易;

import java.util.Scanner;

/*
 * 对于一个整数X，定义操作rev(X)为将X按数位翻转过来，并且去除掉前导0。例如:
如果 X = 123，则rev(X) = 321;
如果 X = 100，则rev(X) = 1.
现在给出整数x和y,要求rev(rev(x) + rev(y))为多少？ 
输入描述:
输入为一行，x、y(1 ≤ x、y ≤ 1000)，以空格隔开。
 * 
 * */
public class ReverseNum {

	public static int rev(int n){
		StringBuffer sb = new StringBuffer(String.valueOf(n));
		String s = sb.reverse().toString().trim();
		return Integer.parseInt(s);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println(rev(rev(x)+rev(y)));
	}
	HashMap
}
