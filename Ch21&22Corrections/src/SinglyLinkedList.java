import java.util.Iterator;

class SinglyLinkedList {
	private ListNode head;
	private ListNode tail; //tail does not work
	private int nodeCount;
	
	public SinglyLinkedList(ListNode hed) {
		head = hed;
		tail = null;
		nodeCount = 0;
	}
	
	public ListNode getHead() { return head; }
	
	
	public SinglyLinkedList(Object[] values) { 
		for(Object value: values) {
			ListNode node = new ListNode(value, null);
				if(head == null) 
					head = node;
				else 
					tail.setNext(node);
				tail = node;
		}
		
		nodeCount = values.length;
	}
	
	public void addFirst(Object value) { head = new ListNode(value, head); }
}
