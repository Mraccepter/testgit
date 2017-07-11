package ≈≈–Ú;

public class HeapSort2 {

	private void maxHeapify(int[] a, int i, int length){
		int l = left(i);
		int r = right(i);
		int max;
		if(l < length && a[l] > a[i])
			max = l;
		else
			max = i;
		if(r < length && a[r] > a[i])
			max = r;
		if(max != i){
			swap(a, i, max);
			maxHeapify(a, max, length);
		}
	}
	private int left(int i){
		return 2*i + 1;
	}
	private int right(int i){
		return 2*i + 2;
	}
	private void swap(int[] a, int i, int j){
		int tem = a[i];
		a[i] = a[j];
		a[j] = tem;
	}
	private void buildMaxHead(int a[]){
		for(int i = a.length/2+1; i >= 0; i--)
			maxHeapify(a, i, a.length);
	}
}
