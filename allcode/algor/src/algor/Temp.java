package algor;

import java.sql.Date;
import java.util.Stack;

public class Temp {

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push("test");
		stack.push(new Integer(1));
		stack.push(true);
		for(int i = 0 ; i <stack.size(); i++)
		{
			System.out.println(stack.pop());
		}
	}
}