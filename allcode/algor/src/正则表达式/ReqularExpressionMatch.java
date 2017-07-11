package 正则表达式;
/*
 * 剑指offer第53题，正则表达式匹配问题
 * 模式中'.'表示任意字符，'*'表示它前面的字符可以出现任意次，包括0次
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
					return match(str, i, pattern, j+2) // 出现0次
							|| match(str, i+1, pattern, j+2) //出现1次
							|| match(str, i+1, pattern, j); // 出现2次或2次以上
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
