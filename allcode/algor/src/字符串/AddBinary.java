package 字符串;
//求两个二进制和
public class AddBinary {

	public static String addBinary(String s1, String s2){
		StringBuffer sb = new StringBuffer();
		StringBuffer sb1 = new StringBuffer(s1);
		StringBuffer sb2 = new StringBuffer(s2);
		int n = s1.length() > s2.length() ? s1.length() : s2.length();
		sb1 = sb1.reverse();
		sb2 = sb2.reverse();
		int flag = 0;
		for(int i =0; i < n; i++){
			int ai = i < s1.length() ? sb1.charAt(i) - '0' : 0;
			int bi = i < s2.length() ? sb2.charAt(i) - '0' : 0;
			int t = (ai + bi + flag) % 2;
			flag = (ai + bi + flag) /2;
			sb.append(t);
		}
		if(flag == 1)
			sb.append(1);
		return sb.reverse().toString();
	}
	public static void main(String[] args) {
		System.out.println(addBinary("11", "1"));
	}
}
