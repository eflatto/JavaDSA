package moreLinkedListPractice;

public class LinkedList {
	
	private Node head;
	private Node tail;
	private int size; 
	
	private class Node{
		private int value;
		private Node next;
		
		public Node(int value, Node next) {
			this.next = next;
			this.value = value;
		}
		public Node(int value) {
			this.next = null;
			this.value = value;
		}
	}
	
	public LinkedList() {
		this.size = 0;
	}
	
	
	public Node insertFirst(int val) {
		Node newNode = new Node(val);
		
		if(tail == null) {
			tail = head;
		}
		
		newNode.next = head;
		head = newNode;
		
		size++;
		
		return head;
	}
	
	public void display(Node head) {
		Node current = head;
		
		while(current!=null) {
			System.out.print(current.value+"-->");
			current=current.next;
		}
		System.out.println("null");
	}
	
	public void insertAtIndex(int index, int value) {
	    // Check if the index is valid
	    if (index < 0 || index > size) {
	        System.out.println("Invalid index for insertion.");
	        return;
	    }

	    Node newNode = new Node(value);
	    Node current = head;

	    // Traverse the list to reach the node before the specified index
	    for (int i = 0; i < index - 1; i++) {
	        current = current.next;
	    }

	    newNode.next = current.next;
	    current.next = newNode;

	    // Update head or tail if necessary
	    if (index == 0) {
	        head = newNode;
	    }
	    if (index == size) {
	        tail = newNode;
	    }

	    size++; // Increment the size of the linked list
	}

	
	public Node deleteFirst() {
		head = head.next;
		
		if(head == null) {
			tail = null;
		}
		 size--;
		 return head;
	}
//	public Node insertAtIndex(index) {
//		
//	}
	
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		
		 
		ll.insertFirst(5);
		ll.insertFirst(4);
		ll.insertFirst(5);
		ll.insertAtIndex(24, 10);
		ll.deleteFirst();
		ll.display(ll.head);
	}
	

}
