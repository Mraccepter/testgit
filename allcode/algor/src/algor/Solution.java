package algor;

import java.util.Arrays;

public class Solution {
	public static String solution(int[] nums) {
		String[] strs = new String[nums.length];
		for(int i=0;i<nums.length;i++) {
			strs[i] = String.valueOf(nums[i]);
		}
		Arrays.sort(strs);
		for(int i=0;i<strs.length-1;i++) {
			if((strs[i] + strs[i+1]).compareTo(strs[i+1]+strs[i]) > 0)  {
				String t = strs[i];
				strs[i] = strs[i+1];
				strs[i+1] = t;
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i=strs.length-1;i>=0;i--) {
			sb.append(strs[i]);
		}
		return sb.toString();
	}
}
