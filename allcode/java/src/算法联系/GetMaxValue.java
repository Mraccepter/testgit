package 算法联系;
/*
 * 在一个先递增后递减的数组中找到最大值
 */
public class GetMaxValue {

	public static int getManInArray(int[] nums){
		
		int length = nums.length;
		if(length == 1)
			return nums[0];
		else if(length == 2)
			return Math.max(nums[0], nums[1]);
		int mid = length /2;
		int start = 0, end = length-1;
		
		while(start < end -1){
			if((nums[mid] > nums[mid-1]) && (nums[mid] < nums[mid+1])){
				start = mid + 1;
			}else if((nums[mid] < nums[mid-1]) && (nums[mid] > nums[mid+1]))
				end = mid - 1;
			else
				return nums[mid];
		}
		return Math.max(nums[start], nums[end]);
	}
	
	public static void main(String[] args) {
		
		int[] nums = {1, 2};
		System.out.println(getManInArray(nums));
		
	}
	
}
