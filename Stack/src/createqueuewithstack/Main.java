package createqueuewithstack;

import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(5);
		
		System.out.println(stack.pop());
	}

}

class QueueUsingStack{
	private Stack<Integer> first;
	private Stack<Integer> second;
	
	public QueueUsingStack() {
		first = new Stack();
		second = new Stack();
	}
	
	public void add(int item) {
		first.push(item);
		
	}
	
	public int remove() {
		while(!first.isEmpty()) {
			second.push(first.pop());
		}
		int removed = second.pop();
		
		while(!second.isEmpty()) {
			first.push(second.pop());
		}
		return removed;
	}
	
}
