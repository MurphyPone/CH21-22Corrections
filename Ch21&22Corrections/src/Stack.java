import java.util.NoSuchElementException;

public class Stack {
	private int[] items;
	private int sp;	//stack pointer
	
	public Stack() {
		items = new int[1024];
		sp = 0;
	}
	
	public int peek() {
		if (sp == 0) {throw new NoSuchElementException(); }
		return items[sp-1];
	}
	
	//#14: write isEmpty, push, pop
	
	public boolean isEmpty() {
		return (sp == 0);
	}
	
	public void push(int x) {
		if(sp >= items.length)
			throw new IndexOutOfBoundsException("Stack is full");
		else items[sp++] = x;	
	}
	
	public int pop() {
		return items[--sp];
	}
	
	//Destructive toString
	public String toString() {
		String result = "";
		
		while(!isEmpty() )
			result += pop() + "\n";
		
		return result;
			
	}
	
	
}
