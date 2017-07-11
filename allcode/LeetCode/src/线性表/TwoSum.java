package ÏßÐÔ±í;

import java.util.HashMap;

public class TwoSum {

	public static void towSum(int[] nums, int target){
		if(nums == null || nums.length < 2)
			return;
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < nums.length; i++){
			map.put(nums[i], i);
		}
		for(int i = 0; i < nums.length; i++){
			int temp = target - nums[i];
			if(map.containsKey(temp) && map.get(temp) > i){
				System.out.println(i+1 + " " + (map.get(temp) + 1));
			}
		}
	}
	public static void main(String[] args) {
		int[] nums = {2,7,11,15};
		towSum(nums, 9);
	}
}
