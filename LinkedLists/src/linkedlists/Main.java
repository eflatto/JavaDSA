package linkedlists;

public class Main {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.addToFront(5);
		list.addToFront(4);
		list.addToFront(3);
		list.addToFront(2);
		list.addToFront(1);
//		System.out.println(list.isEmpty());
		
//		list.removeFromFront();
		list.addToEnd(100);
		list.addToEnd(100);
		list.addToEnd(104);
		list.addToEnd(100);
		System.out.println(list.getNode(4));
//		System.out.println(list.getSize());
		list.display();
		
		
	}

}
