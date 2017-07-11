import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] ss = s.split(" ");
		int len = ss.length;
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < len-1; i++){
			StringBuffer sb2 = new StringBuffer(ss[i]);
			sb.append(sb2.reverse().toString());
			sb.append(" ");
		}
		StringBuffer sb2 = new StringBuffer(ss[len-1]);
		sb.append(sb2.reverse().toString());
		System.out.println(sb.toString());
	}
}
