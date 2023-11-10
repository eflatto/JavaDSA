package searching;

public class RecursiveBinarySearch {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9};
		System.out.println(recursiveBinarySearch(arr, 0,arr.length-1,7));
		
	}

	public static int recursiveBinarySearch(int[] arr,int start,int end,int target) {
	
		if(start<= end) {
			int mid = (start + end)/2;
			
			 if(target<arr[mid]) {
				return recursiveBinarySearch(arr, start, mid-1,target);
			}else if (target>arr[mid]) {
				return recursiveBinarySearch(arr,mid+1, end,target);
			}else {
				return mid;
			}
			
		}
		
		return -1;
	
	}
	
	

}
