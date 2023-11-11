package fundamentals;

public class BinarySearch {
	public static void main(String[] args) {
//		int[] arr = {1,2,3,4,5,6,7,8};
		int[] arr = {8,7,6,5,4,3,2,1};
		System.out.println(binarySearchDescending(arr, 1));
		System.out.println(binarySearch(arr, 1));
		
	}
	
	public static int binarySearch(int [] arr , int target) {
		int start =0;
		int end = arr.length-1;
		
		
		
		while(start <= end) {
//			int mid = start + (end - start) / 2;
			int mid = (start + end)/2;
			
			if(target<arr[mid]) {
				end = mid -1;
			}else if (target>arr[mid]) {
				start = mid+1;
			}else {
				return mid;
			}
		}
		return -1;
	}
	//8,7,6,5,4,3,2,1  target = 7 mid = 5
	public static int binarySearchDescending(int[] arr,int target) {
		int start = 0;
		int end = arr.length-1;
		
		while(start<=end) {
			int mid = (start+end)/2;
			if(target>arr[mid]) {
				end = mid -1;
			}else if(target < arr[mid]) {
				start = mid +1;
			}else {
				return mid;
			}
		}
		return -1;
	}
}