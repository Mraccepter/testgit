package ������;

import java.util.ArrayList;

//��ӡ�������к�Ϊ��������������·��
//������ȱ���
public class PrintSumRoute {
	//һ��Ҫд��������Ϊȫ�ֱ���
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
