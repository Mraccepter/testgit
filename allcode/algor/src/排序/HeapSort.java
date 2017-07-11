package 排序;
//将N个元素排序，堆排序只需少于（2NlgN + 2N）次比较，以及一半次数的交换
//同时最优的利用时间和空间，在最坏的情况下它也能保证使用2NlgN次比较和恒定的额外空间
//但是它无法利用缓存，数组元素很少和相邻元素之间进行比较
public class HeapSort<Key extends Comparable<Key>> {
	private Key[] pq;
	private int N = 0;
	public HeapSort(int maxN){
		pq = (Key[]) new Comparable[maxN+1];
	}
	public boolean isEmpty(){
		return N == 0;
	}
	public int size(){
		return N;
	}
	public void insert(Key v){
		pq[++N] = v;
		swim(N);
	}
	public Key delMax(){
		Key max = pq[1];
		exch(1,N--);
		pq[N+1] = null;
		sink(1);
		return max;
	}
	private boolean less(int i, int j){
		return pq[i].compareTo(pq[j]) < 0;
	}
	private void exch(int i, int j){
		Key t = pq[i];
		pq[i] = pq[j];
		pq[j] = t;
	}
	private void swim(int k){
		while(k > 1&& less(k/2, k)){
			exch(k/2, k);
			k = k/2;
		}
	}
	private void sink(int k){
		while(2*k <= N){
			int j = 2 * k;
			if(j < N && less(j, j+1)) j++;
			if(!less(k, j)) break;
			exch(k, j);
			k = j;
		}
	}
}
