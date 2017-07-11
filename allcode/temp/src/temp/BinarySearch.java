package temp;
//二分查找，有序，可包含重复数字
public class BinarySearch {
	
	public static int binarySearch(int[] array, int k){
		int n = array.length;
		int left = 0; 
		int right = n;
		int count = 0;
		while(left <= right){
			int mid = (right - left) /2;
			if(array[mid] > k)
				right = mid -1;
			else if(array[mid] < k)
				left = mid + 1;
			else {
//				while(array[mid] == array[--mid]);
//				 mid++;
//				 return mid;
//				int temp = mid;
//				while((mid-1 >=0) && array[mid] == array[--mid] ){
//					count++;
//                }
//                while((temp+1 < n) &&array[temp] == array[++temp]){
//                    count++;
//                }
//				 return count;
				for(int i = mid; i < n; i++){
                    if(array[i] == k)
                    count++;
                    else 
                    break;
                }
                 for(int j = mid-1; j >=0; j--){
                   if(array[j] == k)
                    count++;
                    else 
                    break; 
                }
				return count;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] array = {1,1,1,2,3,4,4,4,4,5,6};
		long start = System.currentTimeMillis();
		int m = binarySearch(array,4);
		long end = System.currentTimeMillis();
		System.out.println(end - start);
		System.out.println(m);
	}
}
