package 网易;

import java.util.Scanner;

/*
 * 小易是一个数论爱好者，并且对于一个数的奇数约数十分感兴趣。一天小易遇到这样一个问题： 定义函数f(x)为x最大的奇数约数，x为正整数。 例如:f(44) = 11.
现在给出一个N，需要求出 f(1) + f(2) + f(3).......f(N)
例如： N = 7 
f(1) + f(2) + f(3) + f(4) + f(5) + f(6) + f(7) = 1 + 1 + 3 + 1 + 5 + 3 + 7 = 21
小易计算这个问题遇到了困难，需要你来设计一个算法帮助他。 
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
