package 数组;
//求数组中的逆序对
public class InversePairs {
	
	public static int inverser(int[] array){
		if(array == null || array.length == 0)
			return 0;
		int[] copy = new int[array.length];
		for(int i = 0; i < array.length; i++){
			copy[i] = array[i];
		}
		int count = inversePairsCore(array,copy,0,array.length-1);
		return count;
	}
	private static int inversePairsCore(int[] array, int[] copy,int low, int high){
		if(low == high){
			copy[low] = array[low];
			return 0;
		}
		int mid = (low + high) >>1;
		int leftCount = inversePairsCore(array,copy,low,mid);
		int rightCount = inversePairsCore(array,copy,mid+1,high);
		int count = 0;
		int i = mid;
		int j = high;
		int loCopy = high;
		while(i>= low && j >mid){
			if(array[i] > array[j]){
;				count += j -mid;
				copy[loCopy--] = array[i--];
				if(count >= 100000007){
					count = count % 100000007;
				}
			}else{
				copy[loCopy--] = array[j--];
			}
		}
		for(; i >= low; i--){
			copy[loCopy--] = array[i];
		}
		for(; j > mid; j--){
			copy[loCopy--] = array[j];
		}
		return (leftCount + rightCount + count) % 10000007;
		
	}
	public static void main(String[] args) {
		int[] nums = {7,5,6,4};
		int count = inverser(nums);
		System.out.println(count);
	}
}
