package binarysearch;

public class LeetCode744 {
	
	    public char nextGreatestLetter(char[] letters, char target) {
	        int start = 0;
	        int end = letters.length - 1;

	        while (start <= end) {
	            int mid = start + (end-start) / 2; // Find the middle index
	            
	            if (target < letters[mid]) {
	                end = mid - 1; // If target is smaller, update the end to search the left subarray
	            } else {
	                start = mid + 1; // If target is greater or equal, update the start to search the right subarray
	            }
	        }
	        
	        return letters[start % letters.length]; // Return the character at the start index after the loop
	    }
	

}
