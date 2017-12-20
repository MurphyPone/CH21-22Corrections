
public class Main {

	public static void main(String[] args) {
		//Singly Linked List
		
		String[] objs = new String[5];
			objs[0] = "one";
			objs[1] = "two";
			objs[2] = "three";
			objs[3] = "four";
			objs[4] = "five";
		
		SinglyLinkedList numbers = new SinglyLinkedList(objs);
		
		/*System.out.println("After creation");
		System.out.println(numbers);
		
		System.out.println("\nTry Removal\n");
		System.out.println(numbers.remove("one") );		//Part 1 #10
		System.out.println(numbers +"\n");
		*/
		
		
		//DoublyLinkedList
		
		String[] objs2 = new String[5];
			objs2[0] = "aaa";
			objs2[1] = "bbb";
			objs2[2] = "ccc";
			objs2[3] = "ddd";
			objs2[4] = "eee";
		DoublyLinkedList letters = new DoublyLinkedList(objs2);
		letters.traverseBackwards();	//before fix
		System.out.println("\n 	BackLinks Fixed \n");
		letters.fixBackLinks(); //Part 1 #11
		letters.traverseBackwards();
		
		
		//STACK TESTING
		
		Stack nums = new Stack();		//Part 2 #14
		
		for(int i = 0; i < 1024; i ++) {
			nums.push(i);
		}
		
		//System.out.print("heres the stack:\n" + nums);
		
	}
}
