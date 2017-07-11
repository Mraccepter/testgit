package ³õÊ¼»¯;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n > 50)
			return;
		int sum = 0;
		int l = 0; 
		int left = 0;
		int[] a = new int[100];
		for(int i = 2; i <= n; i++){
			a[l++] = i;
			sum  = sum + i;
			if(sum > n){
				sum = sum - i;
				l--;
				left = n - sum;
				break;
			}
		}
		for(int i = l; left >= 0; left--){
			a[i]++;
			i--;
			if(i < 0)
				i = l -1;
		}
		int result = 1;
		for(int i = 0; i < l; i++){
			result *= a[i];
		}
		System.out.println(result);
	}
}
