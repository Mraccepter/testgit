import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Set<Long> set = new HashSet();
	Long max = (long)Math.pow(2, 63);
	int N = 0, M = 0;
	while(sc.hasNextLine()){
		Long  key = Long.parseLong(sc.nextLine());
//		String key = sc.nextLine();
//		if(!key.matches("[0-9]*"))
//			return;
		if(key < 0 || key >= max)
			return;                                                                                                                                                                                                                             
		if(!key.equals("0")){
			if(!set.contains(key)){
				set.add(key);
			}
		}else{
			break;
		}
		N++;
	}
	M = set.size();
	if(N <0 || N >1000000 || M < 0 || M >800000)
		return;
	System.out.println(M);
	}
}
