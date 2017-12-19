
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
		System.out.println(numbers.remove("one") );
		System.out.println(numbers +"\n");
		
		///STACK TESTING
		
		Stack nums = new Stack();
		
		for(int i = 0; i < 1024; i ++) {
			nums.push(i);
		}
		
		System.out.print("heres the stack:\n" + nums);
		
	}
}
