package temp;

import java.security.SecureClassLoader;
import java.util.HashMap;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int[] c = new int[n];
//		while(sc.hasNextInt()){
//			for(int i = 0; i < n; i++){
//				c[i] = sc.nextInt();
//			}
//		}
//		if(n <3 || n > 10000000)
//			return;
////		for(int i = 1; i < n -1; i++){
////			if(c[i-1] == c[i] || c[i] == c[i+1]){
////				System.out.println(-1 + " " + -1);
////				return;
////			}
////		}
//		int[] result = new int[n];
//		int j = 0;
//		if(c[0] < c[1]){
//			result[0] = 0;
//			j = 1;
//		}
//		for(int i =1; i < n-1; i++){
//			if(c[i] < c[i-1] && c[i] < c[i+1])
//				result[j++] = i;
//		}
//		if(c[n-1] > c[n-2]){
//			result[j] = n-1;
//		}
//		int len = result.length;
//		if(len <= 1){
//			System.out.println(-1 + " " + -1);
//			return;
//		}
//		int start = 0,end= 0,max=Integer.MIN_VALUE;
//		for(int i =0; i < len-1; i++){
//			if(max < result[i+1]-result[i]){
//				max = result[i+1]-result[i];
//				start = result[i];
//				end = result[i+1];
//			}
//		}
//		System.out.println(start + " " + end);
		
		
		
//		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
//		int M = sc.nextInt();
//		String[] sn = new String[N];
//		String[] sm = new String[M];
//		while(sc.hasNextLine()){
//			for(int i = 0; i < N; i++)
//				sn[i] = sc.nextLine();
//			for(int j = 0; j < M; j++)
//				sm[j] = sc.nextLine();
//		
//		for(int i = 0;i <M; i++){
//			String[] split = sm[i].split(" ");
//			int len = split.length;
//			for(int j = 0; j < N; j++){
//				HashMap<String,Integer> map = new HashMap();
//				String[] split2 = sn[j].split(" ");
//				int l = split2.length;
//				for(int m = 0; m < l; m++){
//					String s = split2[m].toLowerCase();
//					if(map.containsKey(s))
//						map.put(s,map.get(s) +1);
//					else
//						map.put(s, 1);
//				}
//				int l2 = map.size();
//				if(len == l2)
//					System.out.println(sn[j]);
//			}
//			
//		}
//	}
//	}
	
		Scanner sc = new Scanner(System.in);
//		String s = sc.next();
//		char[] c = s.toCharArray();
//		int len = c.length;
//		int count = 1;
//		int max = 1;
//		for(int i =1; i < len; i++){
//			if(c[i] == '[' && c[i -1] == '['){
//				count++;
//				if(count > max)
//					max = count;
//			}
//			else
//				count = 1;
//		}
		String s1 = sc.nextLine();
		int n = Integer.parseInt(s1.split(" ")[0]);
		int q = Integer.parseInt(s1.split(" ")[1]);
		String s2 = sc.nextLine();
		int [] a = new int[n];
		for(int i =0; i < s2.split(" ").length;i++)
			a[i] = Integer.parseInt(s2.split(" ")[i]);
		String s3 = sc.nextLine();
		int[] b = new int[n];
		for(int i =0; i < s3.split(" ").length;i++)
			b[i] = Integer.parseInt(s3.split(" ")[i]);
//		
		while(sc.hasNextLine() && q-- >0){
			String ss = sc.nextLine();
			int x = Integer.parseInt(ss.split(" ")[0]);
			int y = Integer.parseInt(ss.split(" ")[1]);
			int count = 0;
			for(int k = 0; k < n; k++){
				if(a[k] >= x && b[k] >= y){
					count++;
				}
			}
			System.out.println(count);
		}
	}
}
