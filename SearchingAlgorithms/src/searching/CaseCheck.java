package searching;

import java.util.Scanner;

public class CaseCheck {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter word to check if it is capital");
		char ch = in.next().charAt(0);
		if(ch >= 'a' && ch <= 'z') {
			System.out.println("lower case");
		}else {
			System.out.println("upper case");
		}
	}
}
