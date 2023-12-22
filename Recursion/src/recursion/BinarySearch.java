package recursion;

public class BinarySearch {
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println(search(0,arr.length-1,1,arr));
		
	}
	
	static int search(int start, int end,int target,int[] arr) {
		int mid = (start + end)/2;
		
		if(target == arr[mid]) {
			return mid;
		}
		if(arr[mid]<target) {
			return search(mid+1,end,target,arr);
		}
		if(arr[mid]>target) {
			return search(start,mid-1,target,arr);
		}
		
		return -1;
		
		
		
	}

}
