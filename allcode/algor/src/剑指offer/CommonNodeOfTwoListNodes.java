package ��ָoffer;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import javax.swing.tree.TreeNode;

//�����������Ĺ������
/*
 * ������ͨ���������Ƕ�����������Ҳû��ָ�򸸽ڵ��ָ��
 * �㷨˼·���ҳ��Ӹ���㵽�����ڵ����������Ȼ������������Ĺ������
 */

public class CommonNodeOfTwoListNodes {

	private static class ListNode{
		int val;
		 List<ListNode> children = new LinkedList<ListNode>();
		 ListNode parent;
		ListNode(int val, ListNode parent){
			this.val = val;
			this.parent = parent;
		}
	}
	public ListNode getListOfRootToGivenNodes(ListNode root, ListNode node1,ListNode node2){
		ListNode head = null;
		if(root == null || node1 == null || node2 == null)
			return null;
		List<ListNode> path1 = new LinkedList<ListNode>();
		List<ListNode> path2 = new LinkedList<ListNode>();
		getNodePath(root, node1, path1);
		getNodePath(root, node2, path2);
		
		return getLastCommonNode( path1, path2);
		
	}
	public static ListNode getLastCommonNode(List<ListNode> list1, List<ListNode> list2){
		Iterator<ListNode> ite1 = list1.iterator();
        Iterator<ListNode> ite2 = list2.iterator();
        ListNode last = null;

        while (ite1.hasNext() && ite2.hasNext()) {
            ListNode tmp = ite1.next();
            if (tmp == ite2.next()) {
                last = tmp;
            }
        }

        return last;
	}
	public static void getNodePath(ListNode root, ListNode node1, List<ListNode> path){
		if(root == null)
			return;
		path.add(root);
		List<ListNode> children = root.children;
		for(ListNode node : children){
			if(node == node1){
				path.add(node1);
				return;
			}else{
				getNodePath(node, node1, path);
			}
		}
		path.remove(path.size() -1);
	}
}
