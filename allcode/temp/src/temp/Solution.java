package temp;

import java.util.HashMap;
import java.util.LinkedHashMap;
//public class Solution {
//    public static int FirstNotRepeatingChar(String str) {
//        int n = str.length();
//        char[] ch = str.toCharArray();
//        LinkedHashMap<Character, Integer> map = new LinkedHashMap();
//        for(int i = 0; i < n; i++){
//            char c = str.charAt(i);
//            if(map.containsKey(c)){
//                map.put(c,map.get(c)+1);
//            }else
//               map.put(c,1);
//        }
//        for(Character cc : map.keySet()){
//            if(map.get(cc) == 1){
//              //      return str.indexOf(map.get(cc)); 这一行有问题！！！
//            	for(int i = 0; i < n; i++)
//            		if(ch[i] == cc)
//            			return i;
//            	
//            }
//        }
//        return -1;
//    }
//    public static void main(String[] args) {
//		String str = "google";
//		int n = FirstNotRepeatingChar(str);
//		System.out.println(n);
//	}
//}

//public class Solution {
//    public static int GetUglyNumber_Solution(int index) {
//        if(index < 0)
//            return 0;
//        if(index == 1)
//            return 1;
//        int n =1;
//        int s = 2;
//        while(n < index){
//            int temp = s;
//            while(temp % 2 == 0){
//                temp = temp /2;
//            }
//            while(temp % 3 == 0){
//                temp = temp / 3;
//            }
//            while(temp % 5 == 0){
//                temp = temp / 5;
//            }
//            if(temp == 1)
//                n++;
//            s++;
//        }
//        return s = s -1;
//    }
//    public static void main(String[] args) {
//    	long startTime = System.currentTimeMillis();
//		int n = GetUglyNumber_Solution(100);
//		long endTime = System.currentTimeMillis();
//		
//		long time = endTime - startTime;
//		
//		System.out.println(time);
//		System.out.println(n);
//	}
//}
//public class Solution {
//    public static String LeftRotateString(String str,int n) {
//        int len = str.length();
//        if(str == null|| n <0)
//            return null;
//		int m = n % len;
//        char[] c = str.toCharArray();
//        char[] t = new char[len];
//        int p = len-m;
//        for(int i = 0 ; i < m; i++)
//            t[p++] = c[i];
//        p = 0;
//        for(int i = m; i < len; i++)
//            t[p++] = c[i];
//        return String.valueOf(t);
//    }
//    public static void main(String[] args) {
//    	String s =LeftRotateString("abcde", 2);
//    	System.out.println(s);
//	}
//}
import java.util.Stack;
public class Solution {
    public static int evalRPN(String[] tokens) {
        int n = tokens.length;
        Stack<Integer> stack = new Stack<Integer>();
        for(int i = 0; i < n; i++){
            if(tokens[i] != "+" && tokens[i] != "-" && tokens[i] != "*" && tokens[i] != "/"){
                stack.push(Integer.parseInt(tokens[i]));
            }else{
                int a = stack.pop();
                int b = stack.pop();
                int c;
                switch(tokens[i]){
                    case "+" : c = a+b;stack.push(c);break;
                    case "-" : c = b - a; stack.push(c);break;
                    case "*" : c = a*b; stack.push(c); break;
                    case "/" : c = b/a; stack.push(c);break;
                }
            }
        }
        return stack.pop();
    }
    public static void main(String[] args) {
		String[] s = {"0","3","/"};
		int n = evalRPN(s);
		System.out.println(n);
	}
}