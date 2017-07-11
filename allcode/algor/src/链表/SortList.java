package 链表;
//链表的排序，时间复杂度为NlgN，空间复杂度为常数？
//使用归并排序的方法，与数组不同，空间复杂度因为只要返回一个链表头，所以不需要创建一个辅助数据
//空间复杂度就降下来了

public class SortList {
	 public ListNode sortList(ListNode head) {
	        int size = 0;
	        ListNode current = head;
	        //下面这句代码值得看
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

