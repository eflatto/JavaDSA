package searching;

public class SearchInRange {
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,7,8,9};
		int target = 3;
		System.out.println(linearSearch(nums, target, 0, 9));
	}
	
	public static int linearSearch(int[] arr,int target,int start,int end) {
		
		for(int i =start;i<=end;i++) {
			if(arr[i]==target) {
				return i;
			}
		}
		return -1;
		
	}
}
