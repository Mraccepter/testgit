package 剑指offer;
/*
 * 数组中重复的数字，在一个长为n的数组里的所有数字都在
 * 0-n-1的范围内，数组中某些数字是重复的，但不知道有几个数字重复了，
 * 亦不知道重复了几次，例如，如果输入长度为7的数组{2,3,1,0,2,5,3}
 * 那么输出是重复的数字为2或3
 * 该算法时间复杂度为O(n)，空间复杂度为O(1)
 */
public class DupilicateNumOfAarrays {
	
	public static int getDupi(int[] nums, int length){
		if(nums == null || length <= 0)
			return -1;
		//忘了这一段代码，要先判断输入是否都在范围内
		for(int i = 0; i < length; i++){
			if(nums[i] < 0 || nums[i] >= length)
				return -1;
		}
		
		for(int i = 0; i < length; i++){
			while(nums[i] != i){
				int tem = nums[i];
				if(nums[i] != nums[nums[i]]){
				nums[i] = nums[tem];
				nums[tem] = tem;
				}else{
				return nums[i];
				}
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] nums = {2,3,1,0,2,5,3};
		int result = getDupi(nums,nums.length);
		System.out.println(result);
	}
}
