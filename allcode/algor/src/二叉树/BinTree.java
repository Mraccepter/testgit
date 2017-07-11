package 二叉树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

//递归、非递归遍历二叉树
public class BinTree {
	public  int date;
	public BinTree left;
	public BinTree right;
	public BinTree(int c){
		date = c;
		left = null;
		right = null;
	}
	//先序递归遍历
	public static void preOrder(BinTree t){
		if(t == null)
			return;
		System.out.println(t.date);
		preOrder(t.left);
		preOrder(t.right);
	}
	//中序遍历递归
	public static void InOrder(BinTree t){
		if(t == null){
			return;
		}
		InOrder(t.left);
		System.out.println(t.date);
		InOrder(t.right);
	}
	//后序遍历递归
	public static void PostOrder(BinTree t){
		if(t == null)
			return;
		PostOrder(t.left);
		PostOrder(t.right);
		System.out.println(t.date);
	}
	//先序遍历非递归
	public static void preOrder2(BinTree t){
		Stack<BinTree> s = new Stack<BinTree>();
		while(t != null || !s.empty()){
			while(t != null){
				System.out.println(t.date);
				s.push(t);
				t = t.left;
			}
			if(!s.empty()){
				t = s.pop();
				t = t.right;
			}
		}
	}
	//中序遍历非递归
	public static void InOrder2(BinTree t){
		Stack<BinTree> s = new Stack();
		while(t != null && !s.empty()){
			while(t != null){
				s.push(t);
				t = t.left;
			}
			if(!s.empty()){
				t = s.pop();
				System.out.println(t.date);
				t= t.right;
			}
		}
	}
	//后序遍历非递归
	public static ArrayList<Integer> PostOrder2(BinTree t){
		ArrayList<Integer> list = new ArrayList();
		if(t == null)
			return list;
		Stack<BinTree> s = new Stack<BinTree>();
		Stack<BinTree> s2 = new Stack<BinTree>();
		s.add(t);
		while(!s.isEmpty()){
			BinTree r = s.pop();
			if(r.left!=null)
				s.add(r.left);
			if(r.right != null)
				s.add(r.right);
			s2.add(r);
		}
		while(!s2.isEmpty()){
			list.add(s2.pop().date);
		}
		return list;
		
	}
	//单栈后序遍历
	public ArrayList<Integer> postOrder3(BinTree t){
		BinTree p = t, r = null;//p为当前访问结点，r为上次访问结点
		Stack<BinTree> s = new Stack();
		ArrayList<Integer> list = new ArrayList();
		while(p != null || !s.isEmpty()){
			if(p != null){
				s.push(p);
				p = p.left;
			}
			else{
				p = s.peek();
				p = p.right;
				if(p != null && p != r){
					s.push(p);
					p = p.left;
				}else{
					p = s.pop();
					list.add(p.date);
					r = p;
					p = null;
				}
			}
		}
		return list;
	}
	
	//构建一个二叉树，从数组的0处开始
	
	private int[] array = {1, 2, 3 ,4, 5};
	private static List<BinTree> nodeList = null;
	
	public void createBinTree(){
		nodeList = new LinkedList<BinTree>();
		for(int nodeIndex = 0; nodeIndex < array.length; nodeIndex++){
			nodeList.add(new BinTree(nodeIndex));
		}
		for(int parentIndex = 0; parentIndex <array.length /2 -1; parentIndex++){
			nodeList.get(parentIndex).left = nodeList.get(parentIndex * 2 +1);
			nodeList.get(parentIndex).right = nodeList.get(parentIndex * 2 +2);
		}
	//对于最后一个父几点，可能没有左孩子，所以单独拿出来讨论	
		 int lastParentIndex = array.length / 2 - 1;
		nodeList.get(lastParentIndex).left = nodeList  
                .get(lastParentIndex * 2 + 1);
		//右孩子，如果数组的长度为奇数才建立右孩子
		if (array.length % 2 == 1) {  
            nodeList.get(lastParentIndex).right = nodeList  
                    .get(lastParentIndex * 2 + 2);  
        }  
		
	}
	
	//根据先序和后序遍历构建唯一一个二叉树，返回二叉树的根
	public BinTree preAndinCreateTree(char[] pre, char[] in,int i, int j, int m, int n){
		int k ;
		BinTree p = null;
		if(n < 0)
			return null;
		p = new BinTree(pre[i]);
		k = m;
		while((k <= n) && in[k] != pre[i])
			k++;
		p.left = preAndinCreateTree(pre,in, i+1, i+k -m,m,k-1);
		p.right = preAndinCreateTree(pre,in,i+k-m+1,j,k+1,n);
		return p;
	}
	//层次遍历
	public void levelOrder(BinTree node){
		Queue<BinTree> queue = new LinkedList<BinTree>();
		if(node == null)
			return;
		queue.add(node);
		while(!queue.isEmpty()){
			BinTree node2 = queue.poll();
			System.out.println(node2.date);
			if(node2.left != null){
				queue.add(node2.left);
			}
			if(node2.right != null){
				queue.add(node2.right);
			}
		}
		
	}
	// 操作给定的二叉树，将其变换为源二叉树的镜像。
    public void Mirror(TreeNode root) {
        if (root != null) {
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            Mirror(root.left);
            Mirror(root.right);
        }
    }
	
	
	
}
