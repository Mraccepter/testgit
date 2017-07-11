package algor;

public class Merge {

	private static boolean less(Comparable v, Comparable w)
	{
		return v.compareTo(w) < 0;
	}
	private static void exch(Comparable[] a, int i, int j)
	{
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = a[i];
	}
	public static boolean isSorted(Comparable[] a)
	{
		for(int i = 1; i < a.length; i++)
		{
			if(less(a[i] ,a[i-1]))
				return false;
		}
		return true;
	}
	public static void sort(Comparable[] a, int lo, int mid, int hi){
		int i = lo;
		int j = mid + 1;
		Comparable[] aux = null;
		for(int k = lo; k <= hi; k++){
			aux[k] = a[k];
		}
		for(int k = lo; k <= hi; k++){
			if(i > mid + 1){
				a[k] = aux[j++];
			}
			else if( j > hi){
				a[k] = aux[i++];
			}
			else if( less(aux[j], aux[i])){
				a[k] = aux[j++];
			}
			else{
				a[k] = aux[i++];
			}
		}
	}
}
