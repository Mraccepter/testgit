package rumenjingdian;

import java.util.Scanner;

public class E3_5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int[] p = new int[1050];
		for(int i = 1; i <= 1000; i++){
			p[i] = 0;
		}
		for(int i = 1; i <=1000; i++){
			int x = i,y=i;
			while(x > 0){
				y += x%10;
				x/=10;
			}
			//ΪʲôҪ��仰��һ��ʼ�����Ѿ�����ʼ��Ϊȫ0����
			if(p[y] == 0)
			p[y] = i;
		}
		while(s.hasNext()){
			System.out.println(p[s.nextInt()]);
		}
	}
}
