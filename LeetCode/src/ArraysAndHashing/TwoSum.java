package ArraysAndHashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public static void main(String[] args) {
		int numsArr[]= new int [] {1,2,3,4,5,6,55};
		int[]result=twoSum(numsArr,5);
		
		System.out.println(Arrays.toString(result));
		
	}
	
	public static int[] twoSum(int arr[],int target) {
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++) {
			
			int complement = target - arr[i];
			
			if(map.containsKey(complement)) {
				return new int[] {map.get(complement),i};
			}
			map.put(arr[i], i);
			
			
		}
		throw new IllegalArgumentException("No two numbers add up to target");
	}
}
