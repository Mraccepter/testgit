package ÏßÐÔ±í;
import java.lang.Class;
public class AddTwoNums {

	public static ListNode addTowNums(ListNode root1, ListNode root2){
		if(root1 == null)
			return root2;
		if(root2 == null)
			return root1;
		ListNode result = new ListNode(-1);
		ListNode head = result;
		int flag = 0;
		while(!(root1 == null && root2 == null)){
			int ai = root1 == null ? 0 : root1.val;
			int bi = root2 == null ? 0 : root2.val;
			int value = (ai + bi + flag) % 10;
			flag = (ai + bi + flag) /10;
			 result.next = new ListNode(value);
			 result = result.next; 
			 if(root1 != null)
				 root1 = root1.next;
			 if(root2 != null)
				 root2 = root2.next;
		}
		if(flag == 1)
			result.next = new ListNode(1);
		return head.next;
	}
	public static void main(String[] args) {
		ListNode root1 = new ListNode(1);
		ListNode root2 = new ListNode(8);
		ListNode root3 = new ListNode(0);
		root1.next = root2;
		addTowNums(root1, root3);
	}
}
