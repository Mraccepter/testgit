package 数组;

import java.util.Scanner;

//求连续子数组的最大和
public class MaxSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i =0; i < n; i++){
			nums[i] = sc.nextInt();
		}
		getMaxNum(nums,n);
	}
	public static void getMaxNum(int[] nums, int n){
		int sum = nums[0];
		int temsum = nums[0];
		for(int i = 1; i < n; i++){
			if(temsum < 0)
				temsum = nums[i];
			else
				temsum += nums[i];
			if(sum < temsum)
				sum = temsum;
		}
		System.out.println(sum);
	}
}
