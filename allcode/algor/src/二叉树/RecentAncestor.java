package 二叉树;
//求两个几点的最近祖先
//已知根结点和左右结点
public class RecentAncestor {

	public BinTree findConmmonParentNode(BinTree root, BinTree nodeA, BinTree nodeB){
		if(root == null)
			return null;
		if(root == nodeA || root == nodeB)
			return root;
		BinTree left = findConmmonParentNode(root.left, nodeA, nodeB);
		BinTree right = findConmmonParentNode(root.right, nodeA, nodeB);
		
		if(left == null)
			return right;
		else if(right == null)
			return left;
		else
			return root;
	}
	//如果二叉树是二叉搜索树的情况
	public BinTree findConmmonParentNode2(BinTree root, BinTree nodeA, BinTree nodeB){
		if(root == null)
			return null;
		if(nodeA.date > root.date && nodeB.date > root.date)
			return findConmmonParentNode2(root.right,nodeA, nodeB);
		else if(nodeA.date < root.date && nodeB.date < root.date)
			return findConmmonParentNode2(root.left,nodeA, nodeB);
		else
			return root;
	}
	
}
