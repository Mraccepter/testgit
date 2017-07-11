package Эјвз;

import java.util.Scanner;

public class ComputeCandy {
	    public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	        int a_b = sc.nextInt();
	        int b_c = sc.nextInt();
	        int ab = sc.nextInt();
	        int bc = sc.nextInt();
	        Integer x = Integer.valueOf(a_b);
	        Integer y = Integer.valueOf(b_c);
	        Integer p = Integer.valueOf(ab);
	        Integer q = Integer.valueOf(bc);
	        if(x == null || y == null || p == null || q == null)
	        	return;
	        if((-30 <= a_b && a_b <= 30) &&(-30 <= b_c && b_c <= 30) &&( -30 <= ab && ab <= 30) &&( -30 <= bc && bc <= 30)){
	            int a = -999 ;
	        int b1 = -999,b2 = -999;
	        int c = -999;
	        if((a_b + ab) % 2 == 0){
	            a = (a_b + ab) /2;
	            b1 = ab - a;
	        }else{
	            System.out.println("No");
	            return;
	        }
	         if((b_c + bc) % 2 == 0){
	            b2 = (b_c + bc) /2;
	            c = bc - b2;
	        }else{
	            System.out.println("No");
	            return;
	        }
	         if(b1 != b2)
	             System.out.println("No");
	        System.out.println(a + " " + b1 + " " + c);
	        }
	        
	        
	            
	    }
}
