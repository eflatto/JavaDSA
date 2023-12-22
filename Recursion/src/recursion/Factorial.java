package recursion;

public class Factorial {
	
	public static void main(String[] args) {
		System.out.println(factorial(30));
	}
	//recursive
	public static long factorial(int num) {
		if(num == 1)return 1;
		
		return num*factorial(num-1);
	}
	
//	iterative
	
//	public static int factorial(int num) {
//		
//		int fact = 1;
//		for(int i = 1;i<=num;i++) {
//			fact *= i;
//			
//		}
//		return fact;
//	}
//	
	

}
