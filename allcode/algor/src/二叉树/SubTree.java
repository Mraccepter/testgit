package 二叉树;
//输入两棵二叉树A和B， 判断B是不是A的子树
public class SubTree {
	public boolean hasSubtree(BinTree root1, BinTree root2){
		boolean result = false;
		if(root1 != null && root2 != null){
			if(root1.date == root2.date){
				result = doesTree1HaveTree2(root1, root2);
			}
			if(!result){
				result = hasSubtree(root1.left, root2);
			}
			if(!result)
				result = hasSubtree(root1.right, root2);
		}
		return result;
	}
	public boolean doesTree1HaveTree2(BinTree root1, BinTree root2){
		if(root2 == null)
			return true;
		if(root1 == null)
			return false;
		if(root1.date != root2.date){
			return false;
		}
		return doesTree1HaveTree2(root1.left, root2.left) && doesTree1HaveTree2(root1.right, root2.right);
		
	}
}
