package 线性表;

public class RemoveDupSortedListII {
	
	public static ListNode removeDupList(ListNode head){
		if(head == null)
			return null;
		ListNode dummy = new ListNode(-1);
		ListNode result = dummy;
		ListNode prev = null;
		ListNode cur = head.next;
		while(head != null){
			if(head.next != null){
			if((prev != null && prev.val != head.val) || (cur != null 
					&& cur.val != head.val)){
				dummy.next = head;
				dummy = dummy.next;
			}
			prev = head;
			head = head.next;
			cur = head.next;	
			}else{
				if(prev != null && prev.val != head.val){
					dummy.next = head;
					dummy = dummy.next;
				}
			}
		}
		return result.next;
	}
	public static ListNode removeDupList2(ListNode head){

			if(head==null||head.next==null)
				return head;
			ListNode newHead = new ListNode(head.val-1);
			newHead.next = head;
			ListNode cur = head;
			ListNode last = newHead;
			while(cur!=null&&cur.next!=null){
				if(cur.val!=cur.next.val){
					last = cur;
				}else{
					while(cur.next!=null&&cur.val==cur.next.val)
						cur = cur.next;
					last.next = cur.next;
				}
				cur = cur.next;
				}
				return newHead.next;
	}
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(1);
		ListNode l3 = new ListNode(2);
		ListNode l4 = new ListNode(3);
		ListNode l5 = new ListNode(3);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		ListNode result = removeDupList2(l1);
		while(result != null){
			System.out.print(result.val + " ");
			result = result.next;
		}
	}
}
