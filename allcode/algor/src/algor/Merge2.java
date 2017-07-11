package algor;
//�Զ����µĹ鲢����
public class Merge2 {

	private static Comparable[] aux;
	public static void sort(Comparable[] a){
		aux = new Comparable[a.length];
		sort(a, 0, a.length - 1);
	}
	public static void sort(Comparable[] a,int lo, int hi){
		if(hi <= lo) return;
		int mid = lo + (hi - lo) /2;
		sort(a, lo, mid);
		sort(a, mid+1, hi);
		Merge.sort(a, lo, mid, hi);
	}
}
