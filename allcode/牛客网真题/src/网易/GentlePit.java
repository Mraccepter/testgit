package ����;

import java.util.HashMap;
import java.util.Scanner;

/*
 * С����һ��Բ��������ԭ���Բ��С��֪��Բ�İ뾶��ƽ����С����Ϊ��Բ�ϵĵ���Һ������궼�������ĵ������ŵģ�С��������Ѱ��һ���㷨��������ŵĵ�ĸ������������������
���磺�뾶��ƽ�����Ϊ25
���ŵĵ���У�(+/-3, +/-4), (+/-4, +/-3), (0, +/-5) (+/-5, 0)��һ��12���㡣
 */
public class GentlePit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n == 0){
			System.out.println(0);
			return;
		}
		int s = (int)(Math.sqrt(n));
		int count = 0;
		int i = 1, j =s;
		int sum = 0;
		while(i <= s && j >= 1){
		 sum = i*i + j*j;
		if(sum > n)
			j = j -1;
		else if(sum < n)
			i = i + 1;
		else{
			count++;
			i++;
			j--;
		}
			
		}
		if( n % s == 0)
			count = count * 4 + 4;
		else
			count = count * 4;
		System.out.println(count);
	}
}
