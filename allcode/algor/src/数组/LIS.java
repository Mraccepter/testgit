package 数组;
//求最长递增子序列
public class LIS {

	public int lis(int[] array){
		int[] lis = new int[array.length];
		for(int i = 0; i < array.length; i++){
			lis[i] = 1;
			for(int j = 0; j < i; j++){
				if(array[i] > array[j] && lis[j] + 1 > lis[i])
					lis[i] = lis[j] + 1;
			}
		}
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < lis.length; i++){
			if(max > lis[i])
				max = lis[i];
		}
		return max;
	}
}
