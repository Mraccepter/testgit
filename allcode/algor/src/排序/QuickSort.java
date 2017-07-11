package ����;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//ԭ������ֻ��Ҫһ����С�ĸ���ջ�����ҽ�����ΪN���������������ʱ���NlgN������
//��ѭ���ȴ���������㷨��Ҫ��С����Ҫȱ���Ƿǳ�����
//�㷨�Ľ�������С���飬��������Ȳ������������Ľ���
//if(hi <= lo +M) {Insertion.sort(a,lo ,hi); return;}
public class QuickSort {
	public static void sort(int[] a){
		Collections.shuffle(Arrays.asList(a));
		sort(a, 0, a.length -1);
	}
	private static void sort(int[] a, int lo, int hi){
		if(lo >= hi) return;
		int j = partition(a, lo, hi);
		sort(a, lo, j-1);
		sort(a, j+1, hi);
	}
	private static void exch(int[] a,int i, int j){
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	
	public static int partition(int[] a, int lo, int hi){
		int v = a[0];
		int i = lo, j = hi +1;
		while(true){
		while(a[++i] < v) if(i == hi) break;
		while(a[--j] > v) if(j == lo) break;
		if(i >= j) break;
		exch(a, i, j);
		}
		exch(a, lo, j);
		return j;
		
	}
	//�ҳ������е�KС��Ԫ��
//	public static int select(int[] a, int k){
//		
//	}
	//���ڽ�����������ҵĺ���ʵ��
//	public static void shuf(int[] a){
//		List list = Arrays.asList(a);
//		Collections.shuffle(list);
//		a = list.toArray();
//	}
	public static void main(String[] args) {
		int[] a = {1,2, 5,3,7};
//		shuf(a);
		System.out.println(Arrays.toString(a));
	}
	
	//���ŵ��Ż�����ȡ���з�
	public static int partition2(int[] a, int lo, int hi){
		//����ȡ��
		int mid = lo + (hi-lo) /2;
		if(a[mid] > a[hi]){
			swap(a[mid], a[hi]);
		}
		if(a[lo] > a[hi]){
			swap(a[lo], a[hi]);
		}
		if(a[mid] > a[lo])
			swap(a[mid], a[lo]);
		int key = a[lo];
		//������
//		while(lo < hi){
//			while(a[hi] > key && hi > lo)
//				hi--;
//			a[lo] = a[hi];
//			while(a[lo] <= key && hi > lo)
//				lo++;
//			a[hi] = a[lo];
//		}
		a[hi] = key;
		return hi;
	}
	public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }
	//�����зֵĿ�������
	private static void sort2(int[] a, int lo, int hi){
		if(lo >= hi) return;
		int lt = lo, i = lo + 1, gt = hi;
		int v = a[lo];
		while(i <= gt){
			if(a[i] > v)
				exch(a, i ,gt--);
			else if(a[i] < v)
				exch(a,i++, lt++);
			else
				i++;
		}
		sort(a, lo, lt -1);
		sort(a, gt + 1, hi);
	}
}
