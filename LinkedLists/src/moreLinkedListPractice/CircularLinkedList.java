package moreLinkedListPractice;

public class CircularLinkedList {
	
	private Node head;
	private Node tail;
	
	public class Node{
		private int value;
		private int next;
		public Node(int value, int next) {
			this.value = value;
			this.next = next;
		}
		
	}

	public CircularLinkedList() {
		this.head = null;
		this.tail = null;
	}
	
	
	
	

}
