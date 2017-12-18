
public class Main {

	public static void main(String[] args) {
		int[] objs = new int[5,4,3,2,1];
		
		SinglyLinkedList numbers = new SinglyLinkedList();
		
		for(ListNode node = numbers.getHead(); node != null; node = node.getNext()) 
			System.out.println(node.getValue());
	}
}
