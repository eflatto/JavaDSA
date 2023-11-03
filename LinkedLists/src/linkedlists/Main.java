package linkedlists;

public class Main {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.addToFront(0);
		list.addToFront(320);
		list.addToFront(44);
		list.addToFront(50);
		list.addToFront(56);
		list.addToFront(656);
		list.addToEnd(55);
		System.out.println(list.getNode(3));
		list.display();
		
		
	}

}
