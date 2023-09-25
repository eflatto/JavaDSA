package ArraysAndHashing;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
	
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7,6};
		int [] arr1 = {1,2,3,4,5,6,7};
		System.out.println(containsDuplicate(arr));
		System.out.println(containsDuplicate(arr1));
	}
	  public static boolean containsDuplicate(int[] nums) {
	    // Create a HashSet to store unique elements encountered.
	    Set<Integer> set = new HashSet<>();

	    // Iterate through the elements in the 'nums' array.
	    for (int i = 0; i < nums.length; i++) {
	        // Attempt to add the current element 'nums[i]' to the 'set'.
	        // If 'add' returns 'false', it means the element is already in the 'set', indicating a duplicate.
	        if (!set.add(nums[i])) {
	            // Duplicate found, return 'true' immediately.
	            return true;
	        }
	    }

	    // If no duplicates were found after looping through the entire array, return 'false'.
	    return false;
	}

	

}
