import java.util.Iterator;

class SinglyLinkedList implements Iterable{
	private Object value;
	private SinglyLinkedList next;
	
	public SinglyLinkedList(Object v) {
		value = v;
		next = null;
	}
	
	public SinglyLinkedList(Object v, SinglyLinkedList nx) {
		value = v;
		next = nx;
	}
	
	public Object getValue() {return value; }
	public SinglyLinkedList getNext() { return next; } 
	
	public void setValue(Object v) { value = v; }
	public void setNext(SinglyLinkedList nx) { next = nx; } 
	
	public String toString() {return (String) value;}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
