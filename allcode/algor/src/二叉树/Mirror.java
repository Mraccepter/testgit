package ¶þ²æÊ÷;
//¶þ²æÊ÷µÄ¾µÏñ
public class Mirror {

	public void mirror(BinTree root){
		if(root == null)
			return;
		if(root.left == null && root.right == null)
			return;
		BinTree tem = root.left;
		root.left = root.right;
		root.right = tem;
		if(root.left != null)
			mirror(root.left);
		if(root.right != null)
			mirror(root.right);
	}
}
