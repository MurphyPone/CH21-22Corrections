public class DoublyLinkedList {
	private ListNode2 head;
	private ListNode2 tail; 
	
	public DoublyLinkedList(ListNode2 hed) {
		head = hed;
		tail = null;
	}
	
	public DoublyLinkedList(ListNode2 hed, ListNode2 tal) {
		head = hed;
		tail = tal;
	}
	
	public ListNode2 getHead() { return head; }
	public ListNode2 getTail() { return tail; }
	
	public void addLast(Object val) {
		ListNode2 node = new ListNode2(val, tail, null);
		if(head == null) {	//If empty
			head = node;
			tail = node;		//both head and tail point to the same node
		} else 
			tail.setNext(node);	//add a node after last
		tail = node;		//change last to that node
	}
	
	public DoublyLinkedList(Object[] values) { 
		for(Object value: values) {
			addLast(value);
		}
	}
	
	
	/* #11 Sevan is bad at coding, fix his backlinks
	 */
	public void traverseBackwards() {
		for(ListNode2 node = tail; node != null; node = node.getPrevious() ) {
			System.out.println(node.getValue());
		}
	}
	
	public void fixBackLinks() {
		for(ListNode2 node = head; node.getNext() != null; node = node.getNext() ) {
			ListNode2 prev = node;	//Get temp value
			node = node.getNext();	//move forward because those links work
			node.setPrevious(prev);	//set prev = temp
			node = node.getPrevious();	//go back so as not to double iterate, which should work bc I just fixed prev
		}
	}
}
