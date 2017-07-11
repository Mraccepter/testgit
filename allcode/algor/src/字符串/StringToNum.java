package �ַ���;

import java.util.Scanner;

//���ַ���ת��Ϊ����
public class StringToNum {

	public static int stringToNum(String s) throws NumberFormatException{
		int length = s.length();
		if(null == s)
			throw new NumberFormatException();
		int result = 0;
		boolean negative = false;
		int radix = 10; //����
		int i = 0;
		int limit = -Integer.MAX_VALUE;
		if(length > 0){
			char ch = s.charAt(0);
			//����з���λ���жϷ���λ
			if(ch < '0'){
				if(ch == '-'){
					negative =true;
				}else if(ch != '+'){
					throw new NumberFormatException();
				}
				//����з���λ�����ҳ���Ϊ1����������
				if(length == 1)
					throw new NumberFormatException();
				i++;
			}
			int multmin = limit / radix;
			while(i < length){
				int digit = Character.digit(s.charAt(i++), radix);
				if(digit < 0)
					throw new NumberFormatException();
				if(result < multmin)
					throw new NumberFormatException();
				result = result * radix;
				if (result < limit + digit) {
                    throw new NumberFormatException();
                }
                result -= digit;
			}
		}else{
			throw new NumberFormatException();
		}
		return negative ? result : -result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int n = stringToNum(s);
		System.out.println(n);
	}
}
