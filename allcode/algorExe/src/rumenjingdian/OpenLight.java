package rumenjingdian;
//代码review 新建一个布尔型数组
public class OpenLight {

	private boolean[] n;
	
	public OpenLight(int n) {
		this.n = new boolean[n +1];
		for(int i = 1; i <= n; i++){
			 this.n[i] = false;
		}
	}
	
	public static void main(String[] args) {
		int n = Integer.valueOf(args[0]);
		int k = Integer.valueOf(args[1]);
		System.out.println(n + " " + k);
		OpenLight o = new OpenLight(n);
		for(int i = 1; i <= k; i++){
			for(int j = 1; j <= n; j++){
				if(j % i == 0)
					o.n[j] = !o.n[j];
			}
		}
		for(int i = 1; i <= n; i++)
			if(o.n[i])
				System.out.println(i);
	}
	
}
