package ����;
//ð������
public class BubbleSort {

	public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = true;//�趨һ����ǣ���Ϊtrue�����ʾ�˴�ѭ��û�н��н�����Ҳ���Ǵ��������Ѿ�����������Ȼ��ɡ�
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
	//ѡ������
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
	//�Ľ���ð������
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
	//�Ľ�2
	public void sort3(int[] nums){
		int m = nums.length -1;
		int k,j;
		while(m > 0){
			for(k = j = 0; j < m; j++){
				if(nums[j] > nums[j+1]){
					int tem = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = tem;
					k = j;//��¼ÿ�ν�����λ��
				}
			}
			m = k;//��¼���һ�ν�����λ��
		}
	}
	//�Ľ�3
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
