package stack;

public class StackwithLinkedList {
	public static void main(String[] args) {
		StackwithLinkedList st = new StackwithLinkedList();
		
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.display();
		
		
		
		
		
	}
	
	private Node top;
	
	private int length;
	
	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next = top;
		top = newNode;
		length++;
		
	}
	
	public void display() {
		Node current = top;
		if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
		
		while(current!=null) {
			System.out.println(current.data);
			current=current.next;
		}
		
	}
	
	public int peek() {
		return top.data;
	}
	
	public boolean isEmpty() {
		return length==0;
	}
	public Node pop() {
		Node node = top;
		top = top.next;
		length--;
		return node;
		
	}
	
	
	private class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
		
		
	}

}
