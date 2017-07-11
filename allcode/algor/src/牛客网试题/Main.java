package Å£¿ÍÍøÊÔÌâ;

public class Main{
    public static boolean isPrime(int n){
        if(n <=1)
            return false;
        if(n == 2 || n == 3)
            return true;
        int l = (int)Math.sqrt(n);
        for(int i =2 ; i <= l; i++){
            if(n % i == 0)
                return false;
        }
        return true;
    }
    public static int[] test(int n)
        {
         int s = (int)Math.sqrt(n);
        int p = 0,q = 0;
        int count =0;
        int[] i = new int[2];
        for(int j = 2; j <=n; j++){
            if(isPrime(j)){
                while(n % j == 0){
                    n /= j;
                    count++;
                }
                if( n ==1){
                    p = j;
                    q = count;
                }
            }
        }
        i[0] = p;
        i[1] = q;
        return i;
    }
    public static void main(String[] args){
//        int n = Integer.parseInt(args[0]);
        int[] i = test(10);
        if(i[0] == 0)
            System.out.println("No");
        else 
            System.out.println(i[0] + " " + i[1]);
    }
}