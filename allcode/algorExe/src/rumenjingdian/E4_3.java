package rumenjingdian;
// �ȼý𷢷�
public class E4_3 {
//����һ��Ҫ�þ�̬������
	static int[] a = new int[25]; 
	static int n,m,k;
	public static int go(int p, int d, int t){
		while(t-- != 0){
			do{
				//ע�⣬��Ϊ��������Ϊ���������Բ�������������д��!!!!!1
//				p = (p+d) % n ;
				p = (p+d+n-1) % n + 1;
//				p = (p+d+n) % n ;
			}while(a[p] == 0);
		}
		return p;
	}
	public static void main(String[] args) {
		 n = Integer.valueOf(args[0]);
		 k = Integer.valueOf(args[1]);//A�Ĳ���
		 m = Integer.valueOf(args[2]);//B�Ĳ���
		for(int i = 1; i <= n; i++){
			a[i] = i;
		}
		int left = n;//ʣ�µ�����
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
