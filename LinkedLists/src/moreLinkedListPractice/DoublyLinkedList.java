package moreLinkedListPractice;

public class DoublyLinkedList {
	Node head;
	
	public void insertFirst(int val) {
		Node node = new Node(val);
		
		node.next = head;
		
		node.prev = null;
		
		if(head!=null) {
			head.prev = node;
			
		}
		
		head = node;
		
		
		
	}
	
	public void display() {
		Node node = head;
		Node last = null;
		while(node != null) {
			System.out.print(node.value+"->");
			last = node;
			node = node.next;
		}
		System.out.println("null");
		
		while(last!= null) {
			System.out.print(last.value+"->");
			last = last.prev;
		}
		System.out.println("null");
	}
	
	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.insertFirst(1);
		dll.insertFirst(2);
		dll.insertFirst(3);
		
		dll.display();
	}
	
	
	private class Node{

		private int value;
		private Node next;
		private Node prev;
		private int size;
		
		
		public Node(int value, Node next, Node prev) {
			this.value = value;
			this.next = next;
			this.prev = prev;
		}
		public Node(int value) {
			this.value = value;
	
		}
		
		
		
		
	}
	
	

}
