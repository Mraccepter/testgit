import java.util.Scanner;
import java.util.Stack;

public class Main5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine().trim();
		Stack<Integer> stack = new Stack<>();
		String[] ss = s.split(" ");
		int count = 0;
		for(int i = 0; i < ss.length; i++){
			if(ss[i].trim().equals(""))
				continue;
			if(ss[i].equals("^")){
				if(stack.isEmpty()){
					System.out.println(-1);
					return;
				}else{
					int tem = stack.pop();
					tem++;
					stack.push(tem);
				}
			}else if(ss[i].equals("+")){
				if(stack.isEmpty()){
					System.out.println(-1);
					return;
				}else{
					int a = stack.pop();
					if(stack.isEmpty()){
						System.out.println(-1);
						return;
					}
					int b = stack.pop();
					int c = a + b;
					stack.push(c);
				}
			}else if(ss[i].equals("*")){

				if(stack.isEmpty()){
					System.out.println(-1);
					return;
				}else{
					int a = stack.pop();
					if(stack.isEmpty()){
						System.out.println(-1);
						return;
					}
					int b = stack.pop();
					int c = a * b;
					stack.push(c);
				}
			}else{
				if(count == 16){
					System.out.println(-2);
					return;
				}
				int temp = Integer.parseInt(ss[i]);
				stack.push(temp);
				count++;
			}
		}
		System.out.println(stack.peek());
	}
}
