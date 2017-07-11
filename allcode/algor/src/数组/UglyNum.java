package สýื้;
//ณ๓สý
public class UglyNum {
	public static int GetUglyNumber_Solution(int index) {
	if(index < 7)
        return index;
    int index2 =0, index5 = 0,index3 = 0;
    int[] nums = new int[index];
    nums[0] = 1;
    for(int i = 1; i < index; i++){
        nums[i] = Math.min(nums[index2] * 2 ,Math.min(nums[index5]*5,nums[index3] *3));
        if(nums[i] == nums[index2] * 2) index2++;
        if(nums[index3] * 3 == nums[i]) index3++;
        if(nums[index5] * 5 == nums[i]) index5++;
    }
    return nums[index-1];
    }
	public static void main(String[] args) {
		GetUglyNumber_Solution(7);
	}
}
