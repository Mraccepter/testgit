package algor;

import java.util.Scanner;
import java.util.Stack;

/*
 * Dijkstra的双栈算术表达式求值算法
 * */
public class Evaluate {
	
	public static void main(String[] args) {
		Stack<String> ops = new Stack<>();
		Stack<Double> vals = new Stack<>();
		String s = null;
		while(( s =new Scanner(System.in).next()).isEmpty())
		{
			if(s.equals("("));
			else if (s.equals("+")) ops.push(s);
			else if (s.equals("-")) ops.push(s);
			else if (s.equals("*")) ops.push(s);
			else if (s.equals("/")) ops.push(s);
			else if (s.equals("sqrt")) ops.push(s);
			else if (s.equals(")")) 
			{
				String op = ops.pop();
				double v = vals.pop();
				if(op.equals("+")) v = vals.pop() + v;
				else if(s.equals("-")) v = vals.pop() - v;
				else if(s.equals("*")) v = vals.pop() * v;
				else if(s.equals("/")) v = vals.pop() / v;
				else if(s.equals("sqrt")) v = Math.sqrt(v);
				vals.push(v);
			}
			else vals.push(Double.parseDouble(s));
		}
		System.out.println(vals.pop());
	}
}
