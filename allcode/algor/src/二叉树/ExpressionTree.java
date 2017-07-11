package 二叉树;

import java.util.Scanner;
import java.util.Stack;

//表达式树
//输入一个表达式树后序遍历结果，求其值和树结构
public class ExpressionTree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		Stack<Integer> stack = new Stack();
		String[] ss = s.split(" ");
//		int[] c = new int[ss.length];
//		for(int j = 0; j < ss.length; j++){
//			c[j] = Integer.parseInt(ss[j]);
//		}
		for(int i =0; i < ss.length; i++){
//			if(ss[i].equals("+") || ss[i].equals("-") || ss[i].equals("*") || ss[i].equals("/"))
			//这一行可以判断一个字符串是否为数字
			if(!ss[i].matches("[0-9]+"))	
			{
				int a = stack.pop();
				int b = stack.pop();
				switch(ss[i]){
				case "+": stack.push(a + b);
						break;
				case "-": stack.push(a - b);
				break;
				case "*": stack.push(a * b);
				break;
				case "/": stack.push(a / b);
				break;
				}
			}else{
				stack.push(Integer.parseInt(ss[i]));
			}
				
		}
		if(!stack.isEmpty())
			System.out.println(stack.pop());
	}
	
}
