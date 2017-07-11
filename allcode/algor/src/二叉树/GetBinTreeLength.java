package 二叉树;
//求二叉树的深度
public class GetBinTreeLength {
//求二叉树的深度
	public int getLength(BinTree root){
		if(root == null)
			return 0;
		if(root.left == null)
			return getLength(root.right) + 1;
		else if(root.right == null)
			return getLength(root.left) + 1;
		else
			return Math.max(getLength(root.left), getLength(root.right)) + 1;
	}
	//判断二叉树是否是平衡树,此方法结点会被重复遍历，效率不高
	public boolean isBalanced(BinTree root){
		if(root == null)
			return true;
		int left = getLength(root.left);
		int right = getLength(root.right);
		int diff = Math.abs(left- right);
		if(diff > 1)
			return false;
		return isBalanced(root.right) && isBalanced(root.left);
	}
	//另一种思路,通过后序遍历的方式
	int right = 0, left = 0;
	public boolean isBalance(BinTree root, int dep){
		if(root == null){
			return true;
		}
		int left = 0, right = 0;
		if(isBalance(root.left, left) && isBalance(root.right, right)){
			int diff = left -right;
			if(diff <= 1 && diff >= -1){
				dep = 1 + (left > right ? left : right);
				return true;
			}
		}
		return false;
	}
}
