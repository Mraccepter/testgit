package ��ָoffer;
/*
 * �������ظ������֣���һ����Ϊn����������������ֶ���
 * 0-n-1�ķ�Χ�ڣ�������ĳЩ�������ظ��ģ�����֪���м��������ظ��ˣ�
 * �಻֪���ظ��˼��Σ����磬������볤��Ϊ7������{2,3,1,0,2,5,3}
 * ��ô������ظ�������Ϊ2��3
 * ���㷨ʱ�临�Ӷ�ΪO(n)���ռ临�Ӷ�ΪO(1)
 */
public class DupilicateNumOfAarrays {
	
	public static int getDupi(int[] nums, int length){
		if(nums == null || length <= 0)
			return -1;
		//������һ�δ��룬Ҫ���ж������Ƿ��ڷ�Χ��
		for(int i = 0; i < length; i++){
			if(nums[i] < 0 || nums[i] >= length)
				return -1;
		}
		
		for(int i = 0; i < length; i++){
			while(nums[i] != i){
				int tem = nums[i];
				if(nums[i] != nums[nums[i]]){
				nums[i] = nums[tem];
				nums[tem] = tem;
				}else{
				return nums[i];
				}
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] nums = {2,3,1,0,2,5,3};
		int result = getDupi(nums,nums.length);
		System.out.println(result);
	}
}
