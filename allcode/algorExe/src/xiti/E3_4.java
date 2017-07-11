package xiti;
//周期串问题
import java.util.Scanner;

public class E3_4 {

	public static void main(String[] args) {
		Scanner str = new Scanner(System.in);
		char[] c = str.nextLine().toCharArray();
		int i,j,flag=1;
		int len = c.length;
		for( i = 1; i <= len; i++){
			if(len % i == 0){
				flag =1;
				for(j = i; j < len; j++){
					if(c[j] != c[j%i]){
						flag = 0;
						break;
					}
				}
				if(flag == 1){
					break;
				}
			}
		}
		System.out.println(i);
	}
}
