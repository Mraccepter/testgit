package 链表;
//将两个有序链表合并，合并后还是有序链表
public class MergeList {
	//递归调用
	public ListNode merge(ListNode list1, ListNode list2){
		if(list1 == null)
			return list2;
		else if(list2 == null)
			return list1;
		ListNode head = null;
		if(list1.val < list2.val){
			head = list1;
			head.next = merge(list1.next, list2);
		}else {
			head = list2;
			head.next = merge(list1, list2.next);
		}
			return head;
	}
	//非递归调用
	public ListNode merge2(ListNode list1, ListNode list2){
		if(list1 == null)
			return list2;
		else if(list2 == null)
			return list1;
		ListNode head = null;
		if(list1.val < list2.val){
			head = list1;
			list1 = list1.next;
		}else {
			head = list2;
			list2 = list2.next;
		}
		ListNode tempHead = head;
		while(list1 != null && list2 != null){
			if(list1.val < list2.val){
				tempHead.next = list1;
				list1 = list1.next;
				tempHead = tempHead.next;
			}else {
				tempHead.next = list2;
				list2 = list2.next;
				tempHead = tempHead.next;
			}
		}
		if(list1 == null)
			tempHead.next = list2;
		else if(list2 == null)
			tempHead.next = list1;
		return head;
	}
}
