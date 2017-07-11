package 数组;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//输入一个正整数数组，把数组里所有数字拼接起来排成一个树，打印能拼接处的所有
//数字中最小的一个。例如{3，32，321}则打印 321323
public class PrintMinNumber {

	//按照顺序，可能有错
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int[] nums = new int[n];
//		for(int i = 0; i < n; i++){
//			nums[i] = sc.nextInt();
//		}
//		if(n == 1){
//			System.out.println(nums[0]);
//			return;
//		}
//		String s = null;
//		for(int j = 1; j < n; j++){
//			s = getMin(nums[j], nums[j-1]);
//			nums[j] = Integer.parseInt(s);
//		}
//		System.out.println(s);
//	}
//	public static String getMin(int s1, int s2){
//		if((s1 + "" + s2 ).compareTo(s2 + "" + s1 ) < 0)
//			return s1 + "" + s2 ;
//		else
//			return s2 + "" + s1;
//	}
	public static String printMinNum(int[] nums){
		if(nums.length <= 0)
			return "";
		String[] s = new String[nums.length];
		for(int i = 0; i < nums.length; i++)
			s[i] = String.valueOf(nums[i]);
		//着重看下面的代码
		Arrays.sort(s, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				String s1 = o1 + "" + o2;
				String s2 = o2 + "" + o1;
				return s1.compareTo(s2);
			}
		});
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < s.length; i++){
			sb.append(s[i]);
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		int[] nums = {3,32,321};
		System.out.println(printMinNum(nums));
	}
}
