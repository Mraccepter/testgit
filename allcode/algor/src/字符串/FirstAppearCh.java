package �ַ���;

import java.util.Scanner;

//�ҳ���һ�����ֵ��ַ�
public class FirstAppearCh {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int[] ch = new int[256];
		for(int i =0; i < ch.length; i++)
			ch[i] =0;
		for(int i = 0; i < s.length(); i++)
			ch[s.charAt(i)] ++;
		for(int i = 0; i < s.length(); i++){
			if(ch[s.charAt(i)] == 1){
				System.out.println(s.charAt(i));
				return;
			}
		}
		System.out.println("");	
		
	}
}
