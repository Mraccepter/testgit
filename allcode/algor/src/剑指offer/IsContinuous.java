package 剑指offer;

import java.util.Arrays;

//扑克牌的顺子问题
public class IsContinuous {

	public static boolean isCon(int[] nums){
		if(nums == null || nums.length < 1)
			return false;
		Arrays.sort(nums);
		int numsOfZero = 0;
		int numsOfGap = 0;
		for(int i = 0; i < nums.length && nums[i] == 0; i++){
				numsOfZero++;
		}
		int start = numsOfZero;
		int end = start + 1;
		while(end < nums.length){
			if(nums[end] - nums[start] == 0)
				return false;
			int gap = nums[end] - nums[start] - 1;
			numsOfGap += gap;
			start = end;
			end++;
		}
		return (numsOfGap > numsOfZero) ? false : true;
	}
	public static void main(String[] args) {
		int[] nums = {0,2,4,5,5};
		boolean result = isCon(nums);
		System.out.println(result);
	}
}
