package 数组;
//数字在排序数组中出现的次数
public class AppearTime {

	public int GetFirst(int[] data, int length, int k, int start, int end){
		if(start > end)
			return -1;
		int mid = (start + end) /2;
		int midData = data[mid];
		
		if(midData == k){
			if((mid > 0) && data[mid - 1] != k || mid == 0)
				return mid;
			else
				end = mid - 1;
		}
		else if(midData > k){
			end = mid - 1;
		}
		else 
			start = mid + 1;
		return GetFirst(data, length, k, start, end);
	}
	public int GetLast(int[] data, int length, int k, int start, int end){
		if(start > end)
			return -1;
		int mid = (start + end) /2;
		int midData = data[mid];
		
		if(midData == k){
			if((mid < length -1) && data[mid + 1] != k || mid == length -1)
				return mid;
			else
				start = mid + 1;
		}
		else if(midData < k)
			start = mid + 1;
		else
			end = mid -1;
		return GetLast(data, length, k, start, end);
	}
}
