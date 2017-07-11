package 网易;

import java.util.HashMap;
import java.util.Scanner;

/*
 * 小易有一个圆心在坐标原点的圆，小易知道圆的半径的平方。小易认为在圆上的点而且横纵坐标都是整数的点是优雅的，小易现在想寻找一个算法计算出优雅的点的个数，请你来帮帮他。
例如：半径的平方如果为25
优雅的点就有：(+/-3, +/-4), (+/-4, +/-3), (0, +/-5) (+/-5, 0)，一共12个点。
 */
public class GentlePit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n == 0){
			System.out.println(0);
			return;
		}
		int s = (int)(Math.sqrt(n));
		int count = 0;
		int i = 1, j =s;
		int sum = 0;
		while(i <= s && j >= 1){
		 sum = i*i + j*j;
		if(sum > n)
			j = j -1;
		else if(sum < n)
			i = i + 1;
		else{
			count++;
			i++;
			j--;
		}
			
		}
		if( n % s == 0)
			count = count * 4 + 4;
		else
			count = count * 4;
		System.out.println(count);
	}
}
