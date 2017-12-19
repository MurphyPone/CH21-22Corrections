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
			ListNode prev = null;  //temp previous node
			ListNode node = head;	//copy of the head 
			
			while(node != null) { 
				if(node.getValue().equals(obj)) {		//If equal
					if(node.getNext() == null) { //at the end of the list
						prev.setNext(null);
						return true;
					} else if(prev == null) {
						head = node.getNext();
					} else {//not at the end of the list
						prev.setNext(node.getNext());
						return true;
					}
				}
				prev = node;
				node = node.getNext();
			}
		}
		return false;
	}
}
