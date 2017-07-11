package MST;

import secondChapter.Queue;

public class LazyPrimMST {

	private boolean[] marked;//��С�������Ķ���
	private Queue<Edge> mst;//��С�������ı�
	private MinPQ<Edge> pq; //���бߣ�����ʧЧ�ıߣ�
	
	public LazyPrimMST(EdgeWeightedGraph G) {
		pq = new MinPQ<Edge>();
		marked = new boolean[G.V()];
		mst = new Queue<Edge>();
		
		visit(G,0);
		
	}
	
}
