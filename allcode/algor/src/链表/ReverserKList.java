package 链表;

import java.util.Scanner;

//k链表反转
public class ReverserKList {

	public static ListNode reverseK(ListNode root, int k){
		ListNode current = root;  
		ListNode next = null;  
		ListNode prev = null;  
	    int count = 0;     
	      
	    /*reverse first k nodes of the linked list */  
	    while (current != null && count < k) {  
	       next  = current.next;  
	       current.next = prev;  
	       prev = current;  
	       current = next;  
	       count++;  
	    }  
	   
	    /* next is now a pointer to (k+1)th node 
	       Recursively call for the list starting from current. 
	       And make rest of the list as next of first node */  
	    if(next !=  null) {  
	        root.next = reverseK(next, k);   
	    }  
	   
	    /* prev is new head of the input list */  
	    return prev; 
	}
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		ListNode root = reverseK(node1,2);
		while(root != null){
			System.out.print(root.val + " ");
			root = root.next;
		}
	}
}
