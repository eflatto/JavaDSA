package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class ADT {
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		q.add(3);
		q.add(6);
		q.add(9);
		q.add(12);
		
		System.out.println(q.peek());
		System.out.println(q.remove());
		System.out.println(q.peek());
		
	}
	

}
