package ����;
/*
 * һ��ֻ����'A'��'B'��'C'���ַ������������ĳһ�γ���Ϊ3�������Ӵ���ǡ��'A'��'B'��'C'����һ������ô����ַ������Ǵ����ģ���������ַ������ǰ��ڵġ����磺
BAACAACCBAAA �����Ӵ�"CBA"�а�����'A','B','C'��һ���������Ǵ������ַ���
AABBCCAABB ������һ������Ϊ3�������Ӵ�����'A','B','C',�����ǰ��ڵ��ַ���
���������Ǽ��������Ϊn���ַ���(ֻ����'A'��'B'��'C')���ж��ٸ��ǰ��ڵ��ַ����� 
��������:
����һ������n����ʾ�ַ�������(1 �� n �� 30)


�������:
���һ��������ʾ�ж��ٸ������ַ���
 * 
 * ��Ŀ������
 * */
import java.util.Scanner;

public class AnHeiString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n < 1 || n > 30)
			return;
		if(n < 3)
			System.out.println(0);
		
		
	}
}
