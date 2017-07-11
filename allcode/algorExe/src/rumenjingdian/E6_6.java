package rumenjingdian;

import java.util.Arrays;

public class E6_6 {

	private final int maxn = 20;
	//注意这里只能用静态的，否则会报错
	public static boolean[] s = new boolean[1<<20];
	
	public static void main(String[] args) {
	
		int m = Integer.parseInt(args[1]);
		int D = Integer.parseInt(args[0]);
		int n = (1<<D) -1;
		//为什么这里一定要给附上初值
		int k = 1;
		for(int i =0; i< n; i++){
			s[i] = false;
		}
		
		for(int j = 0; j < m; j++){
			k = 1;
			for(;;){
				s[k] = !s[k];
				k = s[k] ? k*2 : k*2+1;
				if(k > n) break;
			}
		}
		System.out.println(k/2);
	}
}
