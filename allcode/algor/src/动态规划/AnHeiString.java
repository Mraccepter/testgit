package ��̬�滮;

import java.util.Scanner;

/*
 * һ��ֻ����'A'��'B'��'C'���ַ������������ĳһ�γ���Ϊ3�������Ӵ���ǡ��'A'��'B'��'C'����һ������ô����ַ������Ǵ����ģ���������ַ������ǰ��ڵġ����磺
BAACAACCBAAA �����Ӵ�"CBA"�а�����'A','B','C'��һ���������Ǵ������ַ���
AABBCCAABB ������һ������Ϊ3�������Ӵ�����'A','B','C',�����ǰ��ڵ��ַ���
���������Ǽ��������Ϊn���ַ���(ֻ����'A'��'B'��'C')���ж��ٸ��ǰ��ڵ��ַ�����
 * */
public class AnHeiString {
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        long[] num = new long[input+1];
        num[1] = 3;
        num[2] = 9;
        for(int i=3; i<=input; i++){
            num[i] = 2*num[i-1] + num[i-2];
        }
        System.out.print(num[input]);
    }
}
