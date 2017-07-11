package 线性表;

import java.util.Stack;

//1->2->3->4->5 m =2, n=5 反转2-5的链表
public class ReverseLinkedList {

	public ListNode reverseBetween(ListNode head, int m, int n){
		if(head == null)
			return null;
		if(m < 1 || n < m)
			return null;
		int count = 1;
		Stack<ListNode> stack = new Stack<>();
		ListNode root = head;
		while(count != m){
			root = root.next;
			count++;
		}
		while(count != n +1){
			stack.push(root);
			root = root.next;
			count++;
		}
		ListNode after = root;
		
		
	}
}
