package temp;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GetPrimeSum {

	public static boolean isPrime(int n){
		if(n < 2)
			return false;
		int s = (int)Math.sqrt(n);
		for(int i = 2; i <= s; i++){
			if(n % i == 0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		Map<Integer, Integer> map = new HashMap();
		for(int i = 2; i <= n / 2; i++){
			if(isPrime(i) && isPrime(n-i)){
				count++;
				map.put(i, n-i);
			}
		}
		System.out.println(count);
		for(Map.Entry<Integer, Integer> m : map.entrySet()){
			System.out.println(m.getKey() + ": " + m.getValue());
		}
	}
	
}
