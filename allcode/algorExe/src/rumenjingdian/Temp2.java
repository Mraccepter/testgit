package rumenjingdian;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Temp2 {
//    public static long reverse(int x) {
//        Stack<Integer> s = new Stack<Integer>();
//        int flag = 1;
//        int y;
//        if(x < 0){ 
//        flag = -1;
//        x = -x;
//        }
//        do{
//         y = x % 10;
//            s.push(y);
//            x = x /10;
//        }while(x != 0);
//        long sum = 0;
//        int d = 1;
//        while(!s.empty()){
//            sum += s.pop() *d;
//            d *=10;
//        }
//        return sum*flag;
//    }
//	public static int reverse(int x) {
//        int sign = x < 0 ? -1 : 1;
//        x = Math.abs(x);
//        int res = 0;
//        while (x > 0) {
//            if (Integer.MAX_VALUE/ 10 < res || (Integer.MAX_VALUE - x % 10) < res * 10) {
//                return 0;
//            }
//            res = res * 10 + x % 10;
//            x /= 10;
//        }
//        
//        return sign * res;
//    }
//    public static void main(String[] args) {
//    	int i = reverse(1534236469);
//    	System.out.println(i);
//	}
	 public static String longestCommonPrefix(String[] strs) {
	        if(strs.length == 0) return "";
	        String s = strs[0];
	        int n = s.length();
	        int ns = strs.length;
	        String result="",temp;
	        for(int i =0; i < n; i++){
	            temp = s.substring(0,i+1);
	            for(int j = 0; j < ns; j++){
	                if(!strs[j].startsWith(temp))
	                    return result;
	            }
	            result = temp;
	        }
	        return result;
	    }
	public static void main(String[] args) {
//		int a = 5;
//		int b = 2;
//		double c = (double)a/b;
//		System.out.println(c);
//		String ii = longestCommonPrefix({"a"});
//		String s = "a";
//		String ss = s.substring(0,1);
//		System.out.println(ss);
//		String[] s = {"a"};
//		String ii = longestCommonPrefix(s);
//		System.out.println(ii);\
		//数组不是只能存放同一种类型吗？？？
//		Set ss = new HashSet();
//		ss.add(new Boolean(false));
//		ss.add("i");
//		System.out.println(ss);
//		System.out.println(Arrays.toString(ss.toArray()));
//		
//		Collections.addAll(ss, new Integer(3),"ii");
//		System.out.println(ss);
//		
		List i = new ArrayList();
		i.add("5");
		i.add("0");
		i.add("999");
		List j = new ArrayList();
		j.add("6");
//		j.add("8");
		Collections.copy(i, j);
		System.out.println(i);
		int m = (int)Collections.min(i);
		System.out.println(m);
		
	}
}