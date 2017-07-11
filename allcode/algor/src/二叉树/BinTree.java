package ������;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

//�ݹ顢�ǵݹ����������
public class BinTree {
	public  int date;
	public BinTree left;
	public BinTree right;
	public BinTree(int c){
		date = c;
		left = null;
		right = null;
	}
	//����ݹ����
	public static void preOrder(BinTree t){
		if(t == null)
			return;
		System.out.println(t.date);
		preOrder(t.left);
		preOrder(t.right);
	}
	//��������ݹ�
	public static void InOrder(BinTree t){
		if(t == null){
			return;
		}
		InOrder(t.left);
		System.out.println(t.date);
		InOrder(t.right);
	}
	//��������ݹ�
	public static void PostOrder(BinTree t){
		if(t == null)
			return;
		PostOrder(t.left);
		PostOrder(t.right);
		System.out.println(t.date);
	}
	//��������ǵݹ�
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
	//��������ǵݹ�
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
	//��������ǵݹ�
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
	//��ջ�������
	public ArrayList<Integer> postOrder3(BinTree t){
		BinTree p = t, r = null;//pΪ��ǰ���ʽ�㣬rΪ�ϴη��ʽ��
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
	
	//����һ�����������������0����ʼ
	
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
	//�������һ�������㣬����û�����ӣ����Ե����ó�������	
		 int lastParentIndex = array.length / 2 - 1;
		nodeList.get(lastParentIndex).left = nodeList  
                .get(lastParentIndex * 2 + 1);
		//�Һ��ӣ��������ĳ���Ϊ�����Ž����Һ���
		if (array.length % 2 == 1) {  
            nodeList.get(lastParentIndex).right = nodeList  
                    .get(lastParentIndex * 2 + 2);  
        }  
		
	}
	
	//��������ͺ����������Ψһһ�������������ض������ĸ�
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
	//��α���
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
	// ���������Ķ�����������任ΪԴ�������ľ���
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
