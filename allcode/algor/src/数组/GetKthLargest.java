package 数组;
//求数组中第k大的数
public class GetKthLargest {

	private static void exch(int[] a,int i, int j){
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	public static int partition(int[] a, int lo, int hi){
		//可用这个作为随机打乱
//		int index=new Random().nextInt(nums.length);  
//        int num=nums[index];  
//        swap(nums, index, 0);
		int v = a[0];
		int i = lo, j = hi +1;
		while(true){
		while(a[++i] < v) if(i == hi) break;
		while(a[--j] > v) if(j == lo) break;
		if(i >= j) break;
		exch(a, i, j);
		}
		exch(a, lo, hi);
		return j;
	}
	public static int getKth(int[] nums ,int k){
		if(k > nums.length || k < 1)
			return -1;
		int lo = 0, hi = nums.length - 1;
		while(hi > lo){
			int j = partition(nums, lo, hi);
			if(j == k-1) return nums[j];
			else if (j > k-1) hi = j-1;
			else if (j < k-1) lo = j + 1;
		}
		return nums[k-1];
	}
	
	public static void main(String[] args){
		
		int[] nums = {1,4,2,3,7,5};
		int result = getKth(nums, 3);
		System.out.println(result);
		
	}
}
