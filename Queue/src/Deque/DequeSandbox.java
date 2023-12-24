package Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeSandbox {
	
	public static void main(String[] args) {
		Deque<Integer> deque = new ArrayDeque<>();
		
		deque.add(5);
		deque.add(5);
		deque.add(5);
		deque.addLast(6);
		deque.removeLast();
		
		System.out.println(deque);

	}

}
