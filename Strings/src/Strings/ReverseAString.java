package Strings;

import java.util.Arrays;

public class ReverseAString {
	
	public static void main(String[] args) {
		reverseString("hello");
		
	}
	
	static void reverseString(String s) {
		char[] c = s.toCharArray();
		int left = 0;
		int right = c.length -1;
		
		while(left < right) {
			char tmp = c[left];
			c[left] = c[right];
			c[right] = tmp;
			left++;
			right--;
		}
		
		System.out.println(Arrays.toString(c));
		
	}

}
