package 链表;
//检测一个链表是否有环，如果有返回环的开始位置
public class DetectCycle {
	public ListNode detectCycle(ListNode head) {
        if(head == null)
            return null;
        ListNode x = head, y = head;
        while(y != null && y.next != null){
             x = x.next;
             y = y.next.next; 
            if(x == y){
                break;
            }
        }
        if(y == null || y.next == null)
            return null;
            y = head;
            while(x != y){
                x = x.next;
                y = y.next;
        }
        return x;
    }
	//判断是否有环
	public boolean hasCycle(ListNode head) {
        if(head == null)
            return false;
        ListNode x = head, y = head;
        while(y != null && y.next != null){
             x = x.next;
             y = y.next.next; 
            if(x == y){
                return true;
            }
        }
        	return false;
    }
}
