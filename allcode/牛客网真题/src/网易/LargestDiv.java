package ����;

import java.util.Scanner;

/*
 * С����һ�����۰����ߣ����Ҷ���һ����������Լ��ʮ�ָ���Ȥ��һ��С����������һ�����⣺ ���庯��f(x)Ϊx��������Լ����xΪ�������� ����:f(44) = 11.
���ڸ���һ��N����Ҫ��� f(1) + f(2) + f(3).......f(N)
���磺 N = 7 
f(1) + f(2) + f(3) + f(4) + f(5) + f(6) + f(7) = 1 + 1 + 3 + 1 + 5 + 3 + 7 = 21
С�׼�������������������ѣ���Ҫ�������һ���㷨�������� 
 * */
public class LargestDiv {

	public static int getDiv(int n){
		if(n % 2 == 1)
			return n;
		else{
			while(n % 2 == 0)
				n = n >> 1;
			return n;
		}
	}
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		if(n < 1 || n > 1000000000)
//			return;
		int sum = 0;
		for(int i = 1; i <= 7; i++)
			sum += getDiv(i);
		System.out.println(sum);
	}
}
