package 数组;

import java.util.Scanner;

//数组中只出现一次的数字，有两个
public class AppearOneTime {

	public static void getAppearOneTime(int[] nums){
		if(nums == null)
			return;
		int resultOr = 0;
		for(int i = 0; i < nums.length; i++){
			resultOr = resultOr ^ nums[i];
		}
		int index = findFirstBitIs1(resultOr);
		
		int num1 = 0, num2 = 0;
		for(int i = 0; i < nums.length; i++){
			if(((nums[i] >> index) & 1) == 1){
				num1 = num1 ^ nums[i];
			}else{
				num2 = num2 ^ nums[i];
			}
		}
		System.out.println(num1 + " " + num2);
	}
	public static int findFirstBitIs1(int num){
		int indexBit = 0;
		while((num & 1) == 0 && (indexBit) < 8*4){
			num = num >> 1;
			indexBit++;
		}
		return indexBit;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i =0; i < n; i++){
			nums[i] = sc.nextInt();
		}
		getAppearOneTime(nums);
	}
}
