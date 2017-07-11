package 线性表;
//从尾到头删除第N个指针
public class RemoveNthNode {

	public ListNode removeNthNode(ListNode head, int n){
		ListNode dummy = new ListNode(-1);
		dummy.next = head;
		ListNode sec = dummy;
		ListNode cur = dummy;
		for(int i = 0; i < n; i++){
			sec = sec.next;
		}
		while(sec.next != null){
			cur = cur.next;
			sec = sec.next;
		}
		ListNode tem = cur.next;
		cur.next = tem.next;
		tem = null;
		return dummy.next;
	}
}
