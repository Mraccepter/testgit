package ��Ѷ;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class InterstNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] i = new int[n];
		while(sc.hasNextInt()){
			for(int j = 0 ;j < n; j++){
				i[j] = sc.nextInt();
			}
		}
		Arrays.sort(i);
		//�ж�����ֵ�Ƿ��ظ�,����ظ�����ô�������������С�������ͬ
		if(i[0] == i[n-1]){
			int tem = n * (n-1) / 2;
			System.out.println(tem + " " + tem);
			return;
		}
		HashMap<Integer, Integer> map = new HashMap();
		for(int j = 0; j < n; j++){
			if(map.containsKey(i[j]))
				map.put(i[j], map.get(i[j])+1);
			else
				map.put(i[j], 1);
		}
		int minCount = 0;
		if(map.size() == n){
		int min = Integer.MAX_VALUE;
		for(int j = 0; j < n-1; j++){
			if(i[j+1] -i[j] < min)
				min = i[j+1] - i[j];
		}
		}
		
		
	}
	
}
