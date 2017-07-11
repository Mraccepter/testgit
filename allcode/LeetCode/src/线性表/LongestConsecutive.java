package ���Ա�;

import java.util.HashMap;

//�������������Ԫ�� Ҫ��O(n)
public class LongestConsecutive {

	public static int longestConsecutive(int[] nums){
		HashMap<Integer,Boolean> map = new HashMap<>();
		for(int i : nums){
			map.put(i, false);
		}
		int count = 0;
		int max = -1;
		for(int i : nums){
			//�����
			if(map.get(i))
				continue;
			int tem = i;
			//hashmap��get��put�����ǳ���ʱ���
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
