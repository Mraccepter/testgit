package 线性表;

import java.util.HashMap;

//无序，求最长的连续元素 要求O(n)
public class LongestConsecutive {

	public static int longestConsecutive(int[] nums){
		HashMap<Integer,Boolean> map = new HashMap<>();
		for(int i : nums){
			map.put(i, false);
		}
		int count = 0;
		int max = -1;
		for(int i : nums){
			//求左边
			if(map.get(i))
				continue;
			int tem = i;
			//hashmap的get和put函数是常数时间的
			while(map.containsKey(i)){
				count++;
				map.put(i, true);
				i = i -1;
			}
			i = tem +1;
			while(map.containsKey(i)){
				count++;
				map.put(i, true);
				i = i + 1;
			}
			max = Math.max(max, count);
			count = 0;
		}
		return max;
	}
	public static void main(String[] args) {
		int[] nums = {100, 200, 1, 3, 2};
		System.out.println(longestConsecutive(nums));
	}
}
