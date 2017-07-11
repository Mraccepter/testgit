package 线性表;

import java.util.Arrays;
/*
 * 时间复杂度为O(log(m+n)),空间复杂度一样 
 */
//求两个排序的数组的第K大元素
public class MedianOfTwoSortedArrays {
	
	public double findMedianSortedArrays(int[] a, int[] b){
		int m = a.length;
		int n = b.length;
		int total = m + n;
		if(total % 2 != 0)
			return find_kth(a, 0, m, b, 0, n, total /2);
		else
			return (find_kth(a, 0, m, b, 0, n, total/2 + 1) + 
					find_kth(a, 0, m, b, 0, n, total/2 )) / 2;
	}

	public int  find_kth(int[] a,int aStart, int aEnd, 
			int[] b, int bStart, int bEnd, int k){
		int m = aEnd - aStart;
		int n = bEnd - bStart;
		if(m > n)
			return find_kth(b, bStart, bEnd, a, aStart, aEnd, k);
		if(m == 0) 
			return b[k-1];
		if(k == 1)
			return Math.min(a[0], b[0]);
		
		int ia = Math.min(k /2, m), ib = k - ia;
		if(a[aStart + ia -1] < b[bStart + ib -1]){
			return find_kth(a, aStart + ia, aEnd, b, bStart, bEnd, k-ia);
		}else if(a[aStart + ia -1] > b[bStart + ib -1]){
			return find_kth(a, aStart, aEnd, b, bStart + ib, bEnd, k-ib);
		}else
			return a[ia -1];
		
	}
}
