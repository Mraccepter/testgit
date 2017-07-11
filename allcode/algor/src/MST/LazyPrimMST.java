package MST;

import secondChapter.Queue;

public class LazyPrimMST {

	private boolean[] marked;//最小生成树的顶点
	private Queue<Edge> mst;//最小生成树的边
	private MinPQ<Edge> pq; //横切边（包括失效的边）
	
	public LazyPrimMST(EdgeWeightedGraph G) {
		pq = new MinPQ<Edge>();
		marked = new boolean[G.V()];
		mst = new Queue<Edge>();
		
		visit(G,0);
		
	}
	
}
