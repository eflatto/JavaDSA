package linkedlists;

public class LinkedList {
	private ListNode head;
	private int size;
	
	public ListNode getHead() {
		return head;
	}

	

	public void setHead(ListNode head) {
		this.head = head;
	}


	public void addToFront(int data) {
		ListNode node = new ListNode(data);
		node.setNext(head);
		head = node;
		size++;
	}
	
	public void addToEnd(int data) {
		ListNode node = new ListNode(data);
		if(head==null) {
			head = node;
			return;
		}
		ListNode current = head;
		while(current.getNext()!=null) {
			current= current.getNext();
		}
		current.setNext(node);
		size++;
			
	}
	public ListNode removeFromFront() {
		if(isEmpty()) {
			return null;
		}
		ListNode removedNode = head;
		head = head.getNext();
		size--;
		removedNode.setNext(null);
		return removedNode;
	}
	
	public ListNode getNode(int index) {
		if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

		ListNode current=head;
		int count = 0;
		while(count<index) {
			current = current.getNext();
			
			count++;
		}
		
		return current ;
	}
	
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public int getSize() {
		return size;
	}
	
	public void display() {
		ListNode current = head;
		while(current!=null) {
			System.out.print(current.getData()+"--->");
			current = current.getNext();
		}
		System.out.println("null");
	}
	

}
