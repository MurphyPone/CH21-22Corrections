public class ListNode2 {
	private Object value;
	private ListNode2 previous;
	private ListNode2 next;
	
	public ListNode2(Object v) {
		value = v;
		next = null;
		previous = null;
	}
	
	public ListNode2(Object v, ListNode2 nx, ListNode2 prev) {
		value = v;
		next = nx;
		previous = prev;
	}
	
	public Object getValue() { return value; }
	public ListNode2 getNext() { return next; }
	public ListNode2 getPrevious() { return previous; }

	
	public void setValue(Object v) { value = v; }
	public void setNext(ListNode2 nx) { next = nx; }
	public void setPrevious(ListNode2 prev) { previous = prev; }
}

