package 回文串问题;

import java.util.Scanner;

//给定一个字符串S，你可以从中删除一些字符，使得剩下的回文串最长 
//求需要删除的字符串个数？或者是最长回文串？
public class Question1 {
	public static final int MAX = 1001;
	public static int[][] MaxLen = new int[MAX][MAX];
	public static int maxLen(String s1, String s2){
		int len1 = s1.length();
		int len2 = s2.length();
		for(int i = 0; i < len1; i++){
			MaxLen[i][0] = 0;
		}
		for(int i = 0; i < len2; i++){
			MaxLen[0][i] = 0;
		}
		for(int i = 1; i <= len1; i++){
			for(int j = 1; j <= len2; j++){
				if(s1.charAt(i-1) == s2.charAt(j-1))
					MaxLen[i][j] = MaxLen[i-1][j-1] +1;
			else{
				MaxLen[i][j] = Math.max(MaxLen[i-1][j], MaxLen[i][j-1]);
			}
			}
		}
		//有问题
//		int i =0, j =0;
//		while(i < len1 && j < len2){
//			if(s1.charAt(i) == s2.charAt(j)){
//				System.out.print(s1.charAt(i) + " ");
//				i++;
//				j++;
//			}else if(MaxLen[i+1][j] >= MaxLen[i][j+1])
//				i++;
//			else
//				j++;
//		}
		
		return MaxLen[len1][len2];
		//求最长子串
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String s1 = sc.next();
			String s2 = new StringBuilder(s1).reverse().toString();
			int n = maxLen(s1, s2);
			System.out.println(n);
		}
	}
}
