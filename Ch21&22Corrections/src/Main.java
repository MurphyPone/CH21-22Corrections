
public class Main {

	public static void main(String[] args) {
		String[] objs = new String[5];
			objs[0] = "one";
			objs[1] = "two";
			objs[2] = "three";
			objs[3] = "four";
			objs[4] = "five";
		
		SinglyLinkedList numbers = new SinglyLinkedList(objs);
		
		System.out.println("After creation");
		System.out.println(numbers);
		
		System.out.println("\nTry Removal\n");
		System.out.println(numbers.remove("four") );
		System.out.println(numbers);
		
		///STACK TESTING
		
		Stack ints = new Stack();
		for(int i = 0; i < 10; i ++) {
			ints.push(i);
		}
		
		System.out.print("heres the stack:\n" + ints);
		
	}
}
