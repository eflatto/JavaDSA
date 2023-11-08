package MiscProblems;

import java.util.Scanner;

public class IsPrime {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int number = in.nextInt();
		
		System.out.print(isPrime(number));
		
	}
	
	/**
	 * Checks if a given number is prime.
	 *
	 * @param number The number to check for primality.
	 * @return true if the number is prime, false otherwise.
	 */
	static boolean isPrime(int number) {
	    // Check if the number is less than or equal to 1, which is not prime.
	    if (number <= 1) {
	        return false;
	    }

	    // Initialize the divisor to 2.
	    int divisor = 2;

	    // Iterate through potential divisors up to the square of the number.
	    while (divisor * divisor <= number) {
	        // If the number is divisible by the current divisor, it's not prime.
	        if (number % divisor == 0) {
	            return false;
	        }

	        // Move on to the next potential divisor.
	        divisor++;
	    }

	    // If no divisors were found, the number is prime.
	    return true;
	}

}
