public class DoublyLinkedList {
	private ListNode2 head;
	private ListNode2 tail; //tail does not work
	
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
	
	/* #11 Sevan is bad at coding, fix his backlinks
	 */
	private void traverseBackwards() {
		for(ListNode2 node = tail; node != null; node = node.getPrevious() ) {
			System.out.println(node.getValue());
		}
	}
	
	private void fixBackLinks() {
		for(ListNode2 node = head; node.getNext() != null; node = node.getNext() ) {
			ListNode2 prev = node;	//Get temp value
			node = node.getNext();	//move forward because those links work
			node.setPrevious(prev);	//set prev = temp
			node = node.getPrevious();	//go back so as not to double iterate, which should work bc I just fixed
		}
	}
}
