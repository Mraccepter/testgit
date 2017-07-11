package 二叉树;

import java.util.ArrayList;

//打印二叉树中和为输入整数的所有路径
//深度优先遍历
public class PrintSumRoute {
	//一定要写在外面作为全局变量
	private ArrayList<ArrayList<Integer>> listAll = new ArrayList<>();
	private ArrayList<Integer> list = new ArrayList<>();
	
	public  ArrayList<ArrayList<Integer>> printRoute(BinTree root, int target){
		if(root == null)
			return listAll;
		list.add(root.date);
		target = target - root.date;
		if(target == 0 && root.left == null && root.right == null)
			listAll.add(list);
		printRoute(root.left, target);
		printRoute(root.right, target);
		list.remove(list.size() -1);
		return listAll;
		
	}
}
