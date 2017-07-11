package 腾讯;
//求逆序数，时间复杂度为O(logn)
public class ReverseNum {

	public static int InversePairs(int[] data, int length){
		if(data == null || length < 0)
			return 0;
		int[] copy = new int[length];
		for(int i =0; i < length; i++){
			copy[i] = data[i];
		}
		int count = InversePairsCore(data, copy, 0 , length -1);
		return count;
		
	}
	private static int InversePairsCore(int[] data, int[] copy, int start, int end){
		if(start == end){
			return 0;
		}
		int length = (end - start) / 2;
		int left = InversePairsCore(data, copy, start, start + length);
		int right = InversePairsCore(data, copy, start + length + 1, end);
		
		int i = start + length;
		int j = end;
		int indexCopy = end;
		int count = 0;
		while(i >= start && j >= start + length +1){
			if(data[i] > data[j]){
				copy[indexCopy--] = data[i--];
				count += j -start -length;
			}else{
				copy[indexCopy--] = data[j--];
			}
		}
		for(; i >= start; --i)
			copy[indexCopy--] = data[i];
		for(; j >= start + length + 1; --j)
			copy[indexCopy--] = data[j];
		for(int s = start; s <= end; s++)
			data[s] = copy[s];
		return left + right + count;
	}
	public static void main(String[] args) {
		int[] a = {7,5,6,4};
		int count = InversePairs(a, 4);
		System.out.println(count);
	}
}
