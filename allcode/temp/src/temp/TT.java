package temp;

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
}
public abstract class TT extends M implements T {

TreeNode find(TreeNode root, TreeNode search)	
	if(root == null)
		return null;
	if(search.val < root.val)
		return find(root.left, search);
	else if(search.val > root.val)
		return find(root.right, search);
	else
		return  search;
}

TreeNode Insert(TreeNode root, TreeNode newElement){
	if(root == null){
		TreeNode element = new TreeNode();
		element.val = newElement.val;
		element.left = element.right = null;
	}
	else if(newElement.val < root.val){
		Insert(root.left, newElement);
	}else if(newElement.val > root.val){
		Insert(root.right, newElement);
	}
	return root;//这是新的跟，别忘了返回
}
