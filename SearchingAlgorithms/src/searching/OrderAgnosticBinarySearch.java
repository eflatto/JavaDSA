package searching;

public class OrderAgnosticBinarySearch {
	public static void main(String[] args) {
//		int arr[] = {1,2,3,4,5,6,7,8,9};
		int arr[] = {9,8,7,6,5,4,3,2,1,-1,-1,-2,-3,-4,-5,-6,-7};
		System.out.println(orderAgnosticBinarySearch(arr, 9));
		
	}
	public static int orderAgnosticBinarySearch(int arr[],int target) {
		int start = 0;
		int end = arr.length-1;
		
		boolean isAsc = arr[start]<arr[end];
		
		while(start<=end) {
			int mid = (start + end)/2;
			System.out.println("midpoint = "+ mid);
			
			if(arr[mid]== target) {
				return mid;
			}
			
			if(isAsc) {
			
				if(target<arr[mid]) {
					end = mid -1;
				}else if(target >arr[mid]) {
					start = mid +1;
				}
			}
			else {
				if(target>arr[mid]) {
					end = mid -1;
				}else if(target <arr[mid]) {
					start = mid +1;
				}
			}
		}
		return -1;
	}
}
