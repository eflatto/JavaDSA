package searching;

import java.util.Arrays;

public class FindCealingOfANumberArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,9,10,100};
//		System.out.println(Arrays.binarySearch(arr, 8));
		System.out.println(ceiling(15, arr));
	
	}
	//return index of greatest no <= target
	public static int ceiling(int target,int [] arr) {
		
		int start = 0;
		int end = arr.length-1;
		
		if(target > arr[arr.length-1]) {
			return -1;
		}
		while(start<=end) {
			int mid = (start+end)/2;
			
			if(target<arr[mid]) {
				end = mid-1;
			}
			else if(target>arr[mid]) {
				start = mid+1;
			}
			else {
				return mid;
			}
		}
		return start;
	}


}