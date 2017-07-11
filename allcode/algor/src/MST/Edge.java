package MST;

import javax.management.RuntimeErrorException;
//带权重的边的数据类型
public class Edge implements Comparable<Edge> {

	private final int v;
	private final int w;
	private final double weight;
	
	public Edge(int v, int w, double weight){
		this.v = v;
		this.w = w ;
		this.weight = weight;
	}
	public double weight(){
		return weight;
	}
	public int either(){
		return v;
	}
	public int other(int vertex){
		if(vertex == v) return w;
		else  return v;
	}
	public int compareTo(Edge that){
		if(this.weight < that.weight) return -1;
		else if(this.weight > that.weight) return +1;
		else return 0;
	}
	public String toString(){
		return String.format("%d-%d %.2f",v, w, weight);
	}
}
