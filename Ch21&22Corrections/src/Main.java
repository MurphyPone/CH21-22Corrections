
public class Main {

	public static void main(String[] args) {
		SinglyLinkedList numbers = new SinglyLinkedList(1);
		numbers.setNext(new SinglyLinkedList(2) );
		numbers.setNext(new SinglyLinkedList(3) );
		
		for(SinglyLinkedList number: numbers) 
			System.out.println(number);

	
	}
}
