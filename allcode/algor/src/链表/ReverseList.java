package 链表;
//反转链表

public class ReverseList {

	public static ListNode reverseList(ListNode head){
		ListNode reversedHead = null;
		ListNode node = head;
		ListNode prev = null;
		while(node != null){
			ListNode next = node.next;
			if(next == null)
				reversedHead = node;
			node.next = prev;
			prev = node;
			node = next;
		}
		return reversedHead;
	}
}
