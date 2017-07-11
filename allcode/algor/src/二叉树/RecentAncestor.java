package ������;
//������������������
//��֪���������ҽ��
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
	//����������Ƕ��������������
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
