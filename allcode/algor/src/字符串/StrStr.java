package �ַ���;
//�ж�һ���ַ����Ƿ�Ϊ��һ���ַ������Ӵ�
public class StrStr {

	//������ⷨ,�ж�s2�Ƿ�Ϊs1���Ӵ�
	public boolean strStr(String s1, String s2){
		int len1 = s1.length();
		int len2 = s2.length();
		//ע��Ҫ +1
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
