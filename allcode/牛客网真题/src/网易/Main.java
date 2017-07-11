package 网易;
//牛客网组织题目
import java.util.Arrays;
import java.util.Scanner;
public class Main {
//	public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        while(sc.hasNextInt()){
//            int n = sc.nextInt();
//            if(n <= 10)
//                System.out.println("NO");
//            String s = Integer.valueOf(n).toString();
//            char[] c = s.toCharArray();
//            int len = c.length;
//            int i = 0, j = len -1;
//            int left = c[i], right = c[j];
//            while(i < j){
//            	left = left * c[i];
//            	right *= c[j];
//            if(left < right){
//            	i++;
//            	left = left * c[i];
//            }else if(left > right)
//            {
//            	j--;
//            	right *= c[j];
//            }else{
//            	i++;
//            	j--;
//            	
//            }
//            }
//            if(left == right)
//            	System.out.println("YES");
//            else
//            	System.out.println("NO");
//    }
//}
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
//		String[] s = new String[N];
//		for(int i = 0; i < N; i++){
//			s[i] = sc.next();
//		}
//		for(int i = 0; i < N; i++){
//			char[] c = s[i].toCharArray();
//			Arrays.sort(c);
//			s[i] = String.valueOf(c);
//		}
//		Arrays.sort(s);
//		int count = 1;
//		for(int j = 0; j < N -1; j++){
//			if(!s[j].equals(s[j+1]))
//				count++;
//		}
//		System.out.println(count);
//	}
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
//		int M = sc.nextInt();
//		int K = sc.nextInt();
//		if(N - M +1 < K){
//			System.out.println(0);
//			return;
//		}
		int i =2;
		i = i & 1;
		if(i == 1)
			System.out.println("奇数");
		else 
		System.out.println("偶数");
	}
}
