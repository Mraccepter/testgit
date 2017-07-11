package 剑指offer;
//圆圈中最后剩下的数字
class ListNode{
	int val;
	ListNode next;
	ListNode(int val,ListNode next){
		this.val = val;
		this.next = next;
	}
}
public class LastNum {

	public static int lastNumOfList(int m, int n){
		if(m < 1 || n < 1)
			return -1;
		ListNode head = new ListNode(0,null);
		ListNode tem = head;
		for(int i = 1; i < n; i++){
			ListNode node = new ListNode(i,null);
			tem.next = node;
			tem = node;
		}
		tem.next = head;
		//删除链表中的第K个结点
		int t = m;
		while(head.next != head){
			while(t != 1){
				head = head.next;
				t--;
			}
			ListNode next = head.next.next;
			head.val = head.next.val;
			head.next = next;
			t = m;
		}
		return head.val;
	}
	public static void main(String[] args) {
		int m = 2;
		int n = 5;
		int result = lastNumOfList(m,n);
		System.out.println(result);
	}
}
