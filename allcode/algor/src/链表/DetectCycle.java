package ����;
//���һ�������Ƿ��л�������з��ػ��Ŀ�ʼλ��
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
	//�ж��Ƿ��л�
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
