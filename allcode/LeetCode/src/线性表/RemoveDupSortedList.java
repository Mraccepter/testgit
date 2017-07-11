package 线性表;
//从排序好的链表中删除重复的元素
//1-1-2  return 1-2
public class RemoveDupSortedList {

	public static ListNode removeDupElement(ListNode head){
		if(head == null)
			return null;
		ListNode result = head;
		ListNode root = result;
		//下面这段程序错在哪里？？
		while(head != null && head.next != null){
			if(head.val == head.next.val)
				head = head.next;
			else{
				result.next = head.next;
				result = result.next;
				head = result;
			}
		}
		return root;
	}
	public static ListNode removeDupElement2(ListNode head){
		if(head == null)
			return null;
		ListNode prev = head;
		ListNode cur = prev.next;
		while(cur != null){
			if(prev.val == cur.val){
				prev.next = cur.next;
				cur = prev.next;
			}
				
			else
			{
				prev = cur;
				cur = prev.next;
			}
		}
		return head;
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
		ListNode result = removeDupElement2(l1);
		while(result != null){
			System.out.print(result.val + " ");
			result = result.next;
		}
	}
}
