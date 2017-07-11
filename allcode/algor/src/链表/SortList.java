package ����;
//���������ʱ�临�Ӷ�ΪNlgN���ռ临�Ӷ�Ϊ������
//ʹ�ù鲢����ķ����������鲻ͬ���ռ临�Ӷ���ΪֻҪ����һ������ͷ�����Բ���Ҫ����һ����������
//�ռ临�ӶȾͽ�������

public class SortList {
	 public ListNode sortList(ListNode head) {
	        int size = 0;
	        ListNode current = head;
	        //����������ֵ�ÿ�
	        if(head==null||head.next==null) return head;
	         
	        while(current!=null){
	            size++;
	            current=current.next;
	        }
	         
	        ListNode mid = head;
	        int mid_size = (size-1)/2;
	        for(int i=1;i<=mid_size;i++)
	            mid=mid.next;
	        ListNode s_head = mid.next;
	        mid.next = null;
	        ListNode h1 = sortList(head);
	        ListNode h2 = sortList(s_head);
	        ListNode result = merge(h1,h2);
	         
	        return result;
	    }
	     
	    public ListNode merge(ListNode h1,ListNode h2){
	        if(h1==null) return h2;
	        if(h2==null) return h1;
	        ListNode head,cur,h1_cur=h1,h2_cur=h2;
	        if(h1_cur.val<h2_cur.val){
	            head=h1_cur;
	            cur = head;
	            h1_cur=h1_cur.next;
	        }else{
	            head=h2_cur;
	            cur = head;
	            h2_cur = h2_cur.next;
	        }
	        while(h1_cur!=null&&h2_cur!=null){
	            if(h1_cur.val<h2_cur.val){
	                cur.next = h1_cur;
	                h1_cur=h1_cur.next;
	            }else{
	                cur.next = h2_cur;
	                h2_cur = h2_cur.next;
	            }
	            cur = cur.next;
	        }
	        if(h1_cur!=null)
	            cur.next = h1_cur;
	        if(h2_cur!=null)
	            cur.next = h2_cur;
	        return head;
	    }
	    
}

