package ����;

import java.util.ArrayList;

//����һ������s����ӡ�����к�ΪS�������������У����ٰ�����������
public class SumIsS {

	ArrayList<ArrayList<Integer>> list = null;
	public ArrayList<ArrayList<Integer>> getList(int num){
		list = new ArrayList();
		if(num <= 2)
			return list;
		int start = 1,end = num;
		while(start < num && end >=1){
			int sum = 0;
			for(int i = start; i <= end; i++){
				sum += i;
			}
			if(sum > num)
				end--;
			else if(sum < num)
				start++;
			Integer
		}
	}
}
