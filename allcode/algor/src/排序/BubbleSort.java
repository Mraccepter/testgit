package 排序;
//冒泡排序
public class BubbleSort {

	public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = true;//设定一个标记，若为true，则表示此次循环没有进行交换，也就是待排序列已经有序，排序已然完成。
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                  // swap(arr,j,j+1);
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
    }
	//选择排序
	public void sort(int[] nums){
		if(nums == null)
			return;
		int n = nums.length;
		if(n <= 0)
			return;
		for(int i = 0; i < n; i++){
			for(int j = i+1; j < n; j++){
				if(nums[i] > nums[j]){
					int tem = nums[i];
					nums[i] = nums[j];
					nums[j] = tem;
				}
			}
		}
	}
	//改进的冒泡排序
	public void sort2(int[] nums){
		int n = nums.length;
		boolean flag = false;
		for(int i = 0; i < n && !flag; i++){
			for(int j = i+1; j < n; j++){
				if(nums[i] > nums[j]){
					flag = false;
					int tem = nums[i];
					nums[i] = nums[j];
					nums[j] = tem;
				}
			}
		}
	}
	//改进2
	public void sort3(int[] nums){
		int m = nums.length -1;
		int k,j;
		while(m > 0){
			for(k = j = 0; j < m; j++){
				if(nums[j] > nums[j+1]){
					int tem = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = tem;
					k = j;//记录每次交换的位置
				}
			}
			m = k;//记录最后一次交换的位置
		}
	}
	//改进3
	public void sort4(int[] nums){
		int low,up,index,i;
		low = 0;
		up = nums.length-1;
		index = low;
		
		while(up > low){
			for(i = low; i < up; i++){
				if(nums[i] > nums[i+1]){
					//swap();
					index = i;
				}
			}
			
			up = index;
			for(i = up; i > low; i--){
				if(nums[i] < nums[i-1]){
					//swap
					index = i;
				}
			}
			low = index;
		}
	}
}
