package recursion;

public class SumofDigits {
	
	public static void main(String[] args) {
		System.out.println(prod(56));
	}
	
//	iterative
	
//	static int sum (int n) {
//		int sum =0;
//		
//		while(n != 0) {
//			int digit = n % 10;
//			
//			sum+=digit;
//			
//			n/=10;
//		}
//		return sum;
//	}
	
	
//	recursive
	static int sum (int n) {
		if(n==0) {
			return 0;
		}
		
		return (n%10)+ sum(n/10);
		
	}
	static int prod (int n) {
		if(n%10==n) {
			return n;
		}
		
		return (n%10)* prod(n/10);
		
	}

}
