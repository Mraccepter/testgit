package Dijkstra;

import java.util.Scanner;
import java.util.Stack;

//Dijkstra的双栈算术表达式求值算法
public class Evaluate {

	Scanner s = new Scanner(System.in);
	String ss = s.nextLine();
	public static void main(String[] args) {
		Stack<String> ops = new Stack<String>();
		Stack<Double> vals = new Stack<Double>();
		
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		
		char[] c = s.toCharArray();
		int n = c.length;
		
		for(int i = 0;i < n; i++){
			if(c[i] == '(');
			else if(c[i] == '+') ops.push(c[i]);
			else if(c[i] == '-') ops.push(c[i]);
			else if(c[i] == '*') ops.push(c[i]);
			else if(c[i] == '/') ops.push(c[i]);
			else if(c[i] == '+') ops.push(c[i]);
			
		}
		
	}
}
