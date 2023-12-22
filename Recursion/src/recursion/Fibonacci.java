package recursion;

public class Fibonacci {
	public static void main(String[] args) {
		System.out.println(fib(100));
	}
	
	static int fib(int num) {
	
		if(num <= 2) {
			return 1;
		}
	
		return fib(num-1)+fib(num-2 );
	}

}
