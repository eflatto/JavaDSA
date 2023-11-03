package ArraysAndHashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        // Create an array of integers and a target sum
        int numsArr[] = new int[] {1, 2, 3, 4, 5, 6, 55};
        int[] result = twoSum(numsArr, 11); // Find pairs of numbers that sum to 5

        // Print the result as a string
        System.out.println("answer: "+Arrays.toString(result));
    }

    public static int[] twoSum(int nums[], int target) {
    	  // Create a HashMap to store values and their corresponding indices
    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
        	
            int complement = target - nums[i]; // Calculate the complement
            // System.out.println("complement = "+target+"-"+""+nums[i]+" =  "+complement);
            // System.out.println("Map"+map);
            // Store the current number and its index in the map
            // Check if the complement exists in the map
            if (map.containsKey(complement)) {
                // Return the indices of the two numbers that add up to the target
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        
        
        
        // If no valid pair is found, throw an exception
        throw new IllegalArgumentException("No two numbers add up to the target");
        }
}
