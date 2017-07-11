package rumenjingdian;
//有问题B的结果不对
import java.util.Scanner;

public class E3_4 {

	public static void main(String[] args) {
		int n = Integer.valueOf(args[0]);
		char[] p = args[1].toCharArray();
		Scanner s = new Scanner(System.in);
		while(s.hasNext()){
		char[] c = s.nextLine().toCharArray();
		int A = 0,B = 0;
		for(int i = 0; i < n; i++){
			if(p[i] == c[i])
				A++;
		}
		if(c[0] == 0) return;
		
		for(int d = 1; d <= 9;d++){
			int c1 = 0,c2 = 0;
			for(int i = 0; i < n; i++){
				if(p[i] == d) c1++;
				if(c[i] == d) c2++;
			}
			if(c1<c2) B+=c1;
			else B+= c2;
		}
		System.out.println(A + " " + (B - A));
		}
		
	}
}
