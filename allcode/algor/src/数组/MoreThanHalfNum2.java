package 数组;
//根据数组特点找出O（n)的算法，找出数组中次数超过一半的数学
public class MoreThanHalfNum2 {

	public static int getHalfNum(int[] nums){
		if(nums == null || nums.length <= 0)
			return -1;
		int result = nums[0];
		int times = 1;
		for(int i =1; i < nums.length; i++){
			if(times == 0){
				result = nums[i];
				times = 1;
			}else if(nums[i] == result){
				times++;
			}else
				times--;
		}
		times = 0;
		for(int i = 0; i < nums.length; i++)
			if(nums[i] == result)
				times++;
		if(times*2 <= nums.length)
			return -1;
		else
			return result;
	}
	public static void main(String[] args) {
		int[] nums = {1,2,3,2,2,2,5,4,2};
		System.out.println(getHalfNum(nums));
	}
}
