package 链表;
//复杂链表的复制
class ComplexListNode{
	int value;
	ComplexListNode next;
	ComplexListNode sibling;
	
}
public class ListClone {

	private void cloneNodes(ComplexListNode head){
		ComplexListNode node = head;
		while(node != null){
			ComplexListNode cloned = new ComplexListNode();
			cloned.value = node.value;
			cloned.next = node.next;
			cloned.sibling = null;
			
			node.next = cloned;
			node = cloned.next;
		}
	}
	private void ConnectBilingNodes(ComplexListNode head){
		ComplexListNode node = head;
		while(node != null){
			ComplexListNode cloned = node.next;
			if(node.sibling != null)
				cloned.sibling = node.sibling.next;
			node = cloned.next;
		}
	}
	ComplexListNode ReconnectNodes(ComplexListNode head){
		ComplexListNode node = head;
		ComplexListNode clonedHead = null;
		ComplexListNode clonedNode = null;
		
		if(node != null){
			clonedHead = clonedNode = node.next;
			node.next = clonedNode.next;
			node = node.next;
		}
		while(node != null){
			clonedNode.next = node.next;
			clonedNode = clonedNode.next;
			node.next = clonedNode.next;
			node = node.next;
		}
		return clonedHead;
	}
	ComplexListNode clone(ComplexListNode head){
		cloneNodes(head);
		ConnectBilingNodes(head);
		return ReconnectNodes(head);
	}
}
