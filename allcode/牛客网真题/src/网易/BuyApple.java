package 网易;
import java.util.Scanner;
public class BuyApple {
	
	    public static void main(String[] args){
//	        Scanner sc = new Scanner(System.in);
//	        int n = sc.nextInt();
//	        if( n < 1 || n > 100)
//	            return;
//	        if( n / 2 == 1 || n < 6){
//	            System.out.println(-1);
//	            return;
//	        }
	    	int n = 6;
	        int eightNum = n /8;
	        //注意，eightNum不能再这里直接先减减，否则会影响下面的eightNum值
	        while(eightNum >= 0){
	           if((n - eightNum * 8) % 6 == 0){
	            System.out.println(eightNum + (n - eightNum * 8) / 6);
	            return;
	        	}
	           eightNum--;
	        }
	        System.out.println(-1);
	            
	    }
}
