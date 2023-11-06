package searching;

import java.util.Scanner;

public class FindNthFibonacci {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Input the n you want to find fibonnaci for");
		long n = in.nextInt();
		
		long previous = 0;
		long current = 1;
		
		long count = 2;
		
		while(count <= n) {
			long temp = current;
			current = current + previous;
			previous = temp;
			
			count++;
			
		}
		System.out.println(current);
	}
}
