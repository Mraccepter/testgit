package ����;

import java.util.Scanner;

/*
 * ����һ������X���������rev(X)Ϊ��X����λ��ת����������ȥ����ǰ��0������:
��� X = 123����rev(X) = 321;
��� X = 100����rev(X) = 1.
���ڸ�������x��y,Ҫ��rev(rev(x) + rev(y))Ϊ���٣� 
��������:
����Ϊһ�У�x��y(1 �� x��y �� 1000)���Կո������
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
