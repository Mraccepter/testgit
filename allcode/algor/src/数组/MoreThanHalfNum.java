package 数组;
//数组中出现次数超过一半的数字
public class MoreThanHalfNum {

//基于快排思想的O（n)算法
	public static int getHalfNum(int[] nums){
		if(nums == null || nums.length <= 0)
			return -1;
		int len = nums.length;
		int mid = len/2;
		int start = 0, end = len -1;
		int index = partition(nums, start, end);
		while(index != mid){
			if(index > mid)
				index = partition(nums, start, index-1);
			else if(index < mid)
				index = partition(nums, index+1, end);
		}
		int result = nums[mid];
		int times = 0;
		for(int i = 0; i < len; i++)
			if(nums[i] == result)
				times++;
		if(times*2 <= len)
			return -1;
		else
			return result;
	}
	public static int partition(int[] nums, int start, int end){
		int i = start;
		int j = end+1;
		int v = nums[start];
		while(true){
			while(nums[++i] <= v) if(i == end) break;
			while(nums[--j] >= v) if(j == start) break;
			if(i >= j) break;
			int tem = nums[i];
			nums[i] = nums[j];
			nums[j] = tem;
		}
		int t = nums[start];
		nums[start] = nums[j];
		nums[j] = t;
		return j;
	}
	public static void main(String[] args) {
		int[] nums = {1,2,3,2,2,2,5,4,2};
		System.out.println(getHalfNum(nums));
	}
}
