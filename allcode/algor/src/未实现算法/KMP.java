package 未实现算法;
//查找子字符串
public class KMP {
//暴力查找子字符串时间复杂度为~NM
//	public static int search(String pat, String txt){
//		int M = pat.length();
//		int N = txt.length();
//		//这一行不是应该小于N-M？
//		for(int i = 0; i <= N-M; i++){
//			int j ;
//			for(j = 0; j < M; i++){
//				if(txt.charAt(i+j) != pat.charAt(j))
//					break;
//			}
//			if(j == M) return i;
//		}
//		return N;
//	}
	//改进的暴力求解法
	public static int search(String pat, String txt){
		int j, M = pat.length();
		int i, N = txt.length();
		for(i = 0, j = 0; i < N && j < M;i++){
			if(txt.charAt(i) == pat.charAt(j)) j++;
			else{
				i -= j;
				j = 0;
			}
		}
		if(j == M) return i-M;
		else return N;
	}
	public static void main(String[] args) {
		String pat = "aaab";
		String txt = "aaaaaab";
		search(pat, txt);
	}
}
