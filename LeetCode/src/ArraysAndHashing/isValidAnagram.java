package ArraysAndHashing;

import java.util.Arrays;

public class isValidAnagram {
	public static void main(String[] args) {
		String s = "anagram";
		String t = "nagaram";
		System.out.println(isAnagram(t,s ));
	}
	public static boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
				return false;
			}
			
			int[] charCount = new int[26]; // Assuming lowercase English letters
			
			// Count the frequency of characters in string s
			for (int i = 0; i < s.length(); i++) {
				charCount[s.charAt(i) - 'a']++;
				System.out.println("Added 1 to '" + s.charAt(i) + "': " + Arrays.toString(charCount));
				charCount[t.charAt(i) - 'a']--;
				System.out.println("Subtracted 1 from '" + t.charAt(i) + "': " + Arrays.toString(charCount));
			}
			
			// Decrement the frequency of characters in string t
			for (int i = 0; i < charCount.length; i++) {
				if (charCount[i] != 0) {
					return false; // If each element in the array is not 0 then they are not anagrams
				}
			}
			
			// If all character counts are zero, s and t are anagrams
			return true;
		}
	
//	public static boolean isAnagram(String s, String t) {
//		if(s.length()!=t.length())return false;
//		
//		char[] sArray = s.toCharArray();
//		char[] tArray = t.toCharArray();
//		
//		Arrays.sort(sArray);
//		Arrays.sort(tArray);
//		
//		for(int i =0;i<sArray.length;i++) {
//			if(sArray[i]!=tArray[i])return false;
//		}
//
//		
//		
//		return true;
//	}
}
