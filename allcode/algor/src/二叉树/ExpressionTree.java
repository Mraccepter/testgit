package ������;

import java.util.Scanner;
import java.util.Stack;

//���ʽ��
//����һ�����ʽ������������������ֵ�����ṹ
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
			//��һ�п����ж�һ���ַ����Ƿ�Ϊ����
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
