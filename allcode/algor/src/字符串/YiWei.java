package �ַ���;
//�����ö���Ŀռ䣬���ַ����еĴ�д��ĸ�Ƶ��ַ����ĺ��棬���˳���ܸı�
//�������д�ĺ�6
import java.util.Scanner;

public class YiWei {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String s = sc.next();
			char[] c = s.toCharArray();
			int end = s.length();
			for(int i = 0; i < end; i++){
				if( c[i] >= 65 && c[i] <= 90){
				int j = i;
				for(; j < s.length() -1; j++){
						char cc = c[j];
						c[j] = c[j +1];
						c[j+1] = cc;
					}
				end--;
				i--;
				}
			}
			System.out.println(String.valueOf(c));
		}
	}
}
