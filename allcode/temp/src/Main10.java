import java.util.Scanner;

public class Main10 {

	public static boolean subSeq(int[] nums, int start, int end){
		if(start == end || (end - start) == 1)
			return true;
		int i = start + 1;
		while(nums[i] >= nums[i-1] && nums[i+1] >= nums[i]) {
			if(i < end)
				i++;
			else
				break;
		}
		if(i == end) return true;
		else if(i != start + 1)
			return false;
		while(nums[i] <= nums[i-1] && nums[i+1] <= nums[i]) {
			if(i < end)
				i++;
			else
				break;
		}
		if(i == end) return true;
		else 
			return false;
		}
	public static boolean subSeq2(int[] nums, int start, int end){
		if(start == end || (end - start) == 1)
			return true;
		int i = start;
		while(i < end && nums[i] == nums[++i]);
		if(i == end)
			return true;
		else{
			if(nums[i-1] > nums[i]){
				for(int j = i; j <end; j++){
					if(nums[j] < nums[j+1])
						return false;
				}
				return true;
			}else{
				for(int j = i; j <end; j++){
					if(nums[j] > nums[j+1])
						return false;
				}
				return true;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i = 0 ; i < n; i++){
			nums[i] = sc.nextInt();
		}
		if(1 == n || 2 == n){
			System.out.println(1);
			return;
		}
		int start = 0, end = 2;
		int count = 1;
		while(start < n && end < n){
			if(subSeq2(nums, start, end))
				end++;
			else{
				start = end +1;
				end = start + 1;
				count++;
			}
		}
		System.out.println(count);
	}
}
