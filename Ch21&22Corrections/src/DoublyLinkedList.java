public class DoublyLinkedList {
	private Object value;
	private DoublyLinkedList previous;
	private DoublyLinkedList next;
	
	public DoublyLinkedList (Object v) {
		value = v;
		next = null;
		next = null;
	}
	
	public DoublyLinkedList(Object v, DoublyLinkedList  pr, DoublyLinkedList nx) {
		value = v;
		previous = pr;
		next = nx;
	}
	
	public Object getValue() {return value; }
	public DoublyLinkedList getNext() { return next; } 
	public DoublyLinkedList getPrevious() { return previous; } 

	
	public void setValue(Object v) { value = v; }
	public void setNext(DoublyLinkedList nx) { next = nx; } 
	public void setPrevious(DoublyLinkedList prev) { previous = prev; } 

}
