package 链表;
//删除链表中重复的结点
public class DeleteDupNode {

	public static ListNode deleteDup(ListNode head){
		ListNode first = new ListNode(-1);
		ListNode last = first;
		first.next = head;
		ListNode p = head;
		while(p != null && p.next != null){
			if(p.val == p.next.val){
				int val = p.val;
				while(p != null && p.val == val){
					p = p.next;
				}
				last.next = p;
			}else{
				last = p;
				p = p.next;
			}
		}
		return first.next;
	}
}
