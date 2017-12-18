import java.util.Iterator;
//#10 MyLinkedList = SinglyLinkedList
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
	
	public String toString() {
		String result = "";
		for(ListNode node = head; node != null; node = node.getNext()) 
			result += "\n"+node.getValue();
		return result;
	}
	
	//--CORRECTIONS 
	
	/* #10 removes the first occurrence of the obj from the list
	 * Returns true if successful, otherwise returns false
	 */
	public boolean remove(Object obj) {
		if(head == null)		//Checks if head is null (no objects, so false)
			return false;
		else {
			for(ListNode node = head; node != null; node = node.getNext()) {
				if(node.getValue().equals(obj)) {
					if(node.getNext() == null) //at the end of the list
						node = null;		//does this count as removal?
					else //not at the end of the list
						node.setNext(node.getNext());	
					return true;
				}
			}
		}
		return false;
	}
}
