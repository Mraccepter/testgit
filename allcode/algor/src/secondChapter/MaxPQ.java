package secondChapter;
//基于堆的优先队列
public class MaxPQ<Key extends Comparable<Key>>{
	private Key[] pq;
	private int N = 0;
	private String s = "a";
	
	public MaxPQ(int maxN) {
		pq = (Key[])new Comparable[maxN + 1];
		s= "b";
	}
	public boolean isEmpty()
	{
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
		exch(1, N--);
		pq[N+1] = null;
		sink(1);
		return max;
	}
	private boolean less(int i, int j){
		return pq[i].compareTo(pq[j]) < 0 ;
	}
	private void exch(int i, int j){
		Key t = pq[i];
		pq[i] = pq[j];
		pq[j] = t;
	}
	//由下至上的堆有序化（上浮）
		private void swim(int k){
			while(k > 1 && less(k/2, k)){
				exch(k/2, k);
				k = k/2;
			}
		}
		//由上至下的堆有序化（下沉）
		private void sink(int k){
			while(2*k < N){
				int j = 2*k;
				if(j < N && less(j, j + 1)) j++;
				if(!less(k, j)) break;
				exch(k, j);
				k = j;
			}
		}
}
//public class MaxPQ<Key>extends Queue<Key> {
//
//	
//	private Queue<Key> q = null;
//	//新建一个优先队列
//	public MaxPQ(Queue<Key> q) {
//		this.q = q;
//	}
//	//向优先队列中插入一个元素
//	public void insert(Key key){
//		super.enqueue(key);
//	}
//	//返回最大元素
//	public Key max(){
//		LinkedBlockingQueue
//	}

