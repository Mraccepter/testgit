package temp;

import java.util.Arrays;
//ц╟ещеепР
public class MaoPao {

	public static int[] sort(int[] array){
		if(array == null)
			return null;
		int n = array.length;
		for(int i = 0; i < n; i++)
			for(int j = 0; j < n-i-1; j++){
				if(array[j] > array[j+1]){
					int temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
				}
			}
		return array;
	}
	public static void main(String[] args) {
		int[] a= {2,4,1,6,5};
		sort(a);
		System.out.println(Arrays.toString(a));
	}
	
	
}
