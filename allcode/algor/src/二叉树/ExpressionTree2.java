package 二叉树;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

//中缀转后缀
public class ExpressionTree2 {

	private static final Map<String,Integer> basic = new HashMap<String,Integer>();
	static{
		basic.put("-", 2);
		basic.put("+", 2);
		basic.put("*", 1);
		basic.put("/", 1);
		basic.put("(", 0);
	}
	public static void toSuffix(String infix){
		Stack<String> stack = new Stack();
		String[] ss = infix.split(" ");
		for(int i = 0; i<ss.length; i++){
			if(ss[i].matches("[0-9]+")){
				System.out.print(ss[i] + " ");
			}else if(ss[i].equals("-")){
				if(stack.isEmpty())
					stack.push("-");
				else
				{
					while(!stack.isEmpty()){
					String temp = stack.peek();
					if(basic.get(temp) <= basic.get("-") && !temp.equals("(")){
						System.out.print(stack.pop() + " ");
					}else{
						
						break;
					}
					}
					stack.push("-");
				}
			}
			else if(ss[i].equals("+")){
				if(stack.isEmpty())
					stack.push("+");
				else
				{
					while(!stack.isEmpty()){
					String temp = stack.peek();
					if(basic.get(temp) <= basic.get("+") && !temp.equals("(")){
						System.out.print(stack.pop()+ " ");
					}else{
						break;
					}
					}
					stack.push("+");
				}
			}
			else if(ss[i].equals("*")){
				if(stack.isEmpty())
					stack.push("*");
				else
				{
					while(!stack.isEmpty()){
					String temp = stack.peek();
					if(basic.get(temp) <= basic.get("*") && !temp.equals("(")){
						System.out.print(stack.pop()+ " ");
					}else{
						break;
					}
					}
					stack.push("*");
				}
			}
			else if(ss[i].equals("/")){
				if(stack.isEmpty())
					stack.push("/");
				else
				{
					while(!stack.isEmpty()){
					String temp = stack.peek();
					if(basic.get(temp) <= basic.get("/") && !temp.equals("(")){
						System.out.print(stack.pop()+ " ");
					}else{
						
						break;
					}
					}
					stack.push("/");
				}
			}
			else if(ss[i].equals("(")){
					stack.push("(");
			}
			else if(ss[i].equals(")")){
					while(!stack.isEmpty() && !stack.peek().equals("(")){
						System.out.print(stack.pop()+ " ");
					}if(!stack.isEmpty())
						stack.pop();
					}
			}
		while(!stack.isEmpty())
			System.out.print(stack.pop() + " ");
		}
	public static void main(String[] args) {
		String s = "1 + 2 * 3 + ( 4 * 5 + 6 ) * 7";
		toSuffix(s);
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
