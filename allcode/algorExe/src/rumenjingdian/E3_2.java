package rumenjingdian;

import java.util.Scanner;

public class E3_2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//��֤����һֱ���룬���Ҫ����������һ���ַ�����Ϊ������־
		while(s.hasNext()){
		String a = s.nextLine();
		char[] c = a.toCharArray();
		for(int i = 0; i < c.length; i++){
			if(c[i] == 'o')
				c[i] = 'i';
		}
		System.out.println(String.valueOf(c));
		}
	}
}
