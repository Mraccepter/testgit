package ¶þ²æÊ÷;

import java.util.Stack;

public class ConverBSTToList {

	public BinTree Conver(BinTree root){
		if(root == null)
			return null;
		Stack<BinTree> stack = new Stack();
		BinTree p = root;
		BinTree pre = null;
		boolean isFirst = true;
		while(root != null && !stack.isEmpty()){
			while(root != null){
				stack.push(p);
				p = p.left;
			}
			p = stack.pop();
			if(isFirst){
				root = p;
				pre = root;
				isFirst = false;
			}else{
				pre.right = p;
				p.left = pre;
				pre = p;
			}
			p = p.right;
		}
		return root;
	}
}
