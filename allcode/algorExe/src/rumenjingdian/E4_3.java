package rumenjingdian;
// 救济金发放
public class E4_3 {
//这里一定要用静态变量吗？
	static int[] a = new int[25]; 
	static int n,m,k;
	public static int go(int p, int d, int t){
		while(t-- != 0){
			do{
				//注意，因为步长可以为负数，所以不能用下面这种写法!!!!!1
//				p = (p+d) % n ;
				p = (p+d+n-1) % n + 1;
//				p = (p+d+n) % n ;
			}while(a[p] == 0);
		}
		return p;
	}
	public static void main(String[] args) {
		 n = Integer.valueOf(args[0]);
		 k = Integer.valueOf(args[1]);//A的步长
		 m = Integer.valueOf(args[2]);//B的步长
		for(int i = 1; i <= n; i++){
			a[i] = i;
		}
		int left = n;//剩下的人数
		int p1 = n, p2 =1;
		while(left != 0){
			p1 = go(p1, 1, k);
			p2 = go(p2, -1, m);
			System.out.print(p1);
			left--;
			if(p2 != p1){
				System.out.print(p2);
				left--;
			}
			a[p1] = a[p2] = 0;
			if(left != 0)
				System.out.println(",");
		}
	}
}
