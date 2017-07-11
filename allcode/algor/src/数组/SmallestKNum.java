package 数组;

import java.util.ArrayList;

import 牛客网试题.Main;

//求输入的n个整数中，最小的K个数
public class SmallestKNum {
//利用快排思想
	private static int partition(int[] nums, int lo, int hi){
		int v = nums[0];
		int i = lo, j = hi +1;
		int mid = lo + (hi-lo) / 2;
		while(true){
			while(nums[++i] >= v) 
				if(i == hi)
					break;
			while(nums[--j] <= v)
				if(j == lo)
					break;
			if(i >= j)
				break;
			exch(nums, i, j);
		}
		exch(nums,lo, j);
		return j;
	}
	private static void exch(int[] a,int i, int j){
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	public static ArrayList<Integer> getSmallestKNum(int[] nums, int k){
		ArrayList<Integer> list = new ArrayList<Integer>();
		//这一行代码看看
		if(nums == null || nums.length <= 0 || k < 1 || k > nums.length)
			return null;
		int lo = 0;
		int hi = nums.length-1;
		int j = partition(nums, lo, hi);
		while(j != k-1){
			if(j > k -1){
				hi = j -1;
				j = partition(nums, lo, hi);
			}else{
				lo = j + 1;
				j = partition(nums, lo, hi);
			}
		}
		for(int i = 0; i < k; i++){
			list.add(nums[i]);
		}
		return list;
	}
	
	//O(nlogk)的算法，特别适合处理海量数据
	public static ArrayList<Integer> getSmallestKNums(int[] nums, int k){
		ArrayList<Integer> list = new ArrayList<Integer>();
		//这一行代码看看
		if(nums == null || nums.length <= 0 || k < 1 || k > nums.length)
			return null;
		int N = nums.length;
		//构造了一个最大堆
		for(int i = k/2 -1; i >= 0;i--){
			sink(nums, i, k-1);
		}
		for(int i = k+1; i < N; i++){
			if(nums[i] < nums[1]){
				nums[1] = nums[i];
				sink(nums, 1, k);
			}
		}
		for(int i = 1; i <= k; i++){
			list.add(nums[i]);
		}
		return list;
	}
	private static void sink(int[] a, int k, int N){
		
		while(2*k + 1 <= N){
			int j = 2*k + 1;
			if(j < N && a[j] < a[j+1])
				j++;
			if(a[k] >= a[j]) break;
			exch(a, k, j);
			k = j;
		}
	}
	public static void main(String[] args) {
		int[] nums = {1,6,2,4,3,5};
		ArrayList<Integer> list = getSmallestKNums(nums, 4);
		System.out.println(list.toString());
	}
}
