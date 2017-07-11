package ������ʽ;
/*
 * ��ָoffer��53�⣬������ʽƥ������
 * ģʽ��'.'��ʾ�����ַ���'*'��ʾ��ǰ����ַ����Գ�������Σ�����0��
 */
public class ReqularExpressionMatch {

	public static boolean match(String str, String pattern){
		if(str == null || pattern == null)
			return false;
		return match(str,0, pattern, 0);
	}
	private static boolean match(String str, int i, String pattern ,int j){
		
		if(str.length() == i && pattern.length() == j)
			return true;
		
		if(str.length() != i && pattern.length() == j)
			return false;
		
		if(str.length() == i && pattern.length() != j)
			return false;
		
		if(j + 1 < pattern.length() && pattern.charAt(j+1) == '*'){
			if(str.charAt(i) == pattern.charAt(j) || (pattern.charAt(j) == '.' && str.charAt(i) != ' '))
					return match(str, i, pattern, j+2) // ����0��
							|| match(str, i+1, pattern, j+2) //����1��
							|| match(str, i+1, pattern, j); // ����2�λ�2������
			else
				return match(str, i, pattern, j +2);
		}else{
			if(str.charAt(i) == pattern.charAt(j) || (pattern.charAt(j) == '.' && str.charAt(i) != ' '))
				return match(str, i+1, pattern, j +1);
		}
		return false;
	}
	public static void main(String[] args) {
		String str = "aaa";
		String pattern = "a.a", pattern1 = "aa.a", pattern2 = "ab*a" ,pattern3 = "ab*ac*a";
		System.out.println(match(str, pattern3));
	}
}
