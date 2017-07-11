package 字符串;
//判断一个字符串是否为另一个字符串的子串
public class StrStr {

	//暴力求解法,判断s2是否为s1的子串
	public boolean strStr(String s1, String s2){
		int len1 = s1.length();
		int len2 = s2.length();
		//注意要 +1
		int n = len1 - len2 + 1;
		for(int i = 0; i < n; i++){
			int j = i;
			int k = 0;
			while(j < len1 && k < len2 && s1.charAt(j) == s2.charAt(k)){
				j++;
				k++;
			}
			if(k == len2)
				return true;
		}
		return false;
	}
}
