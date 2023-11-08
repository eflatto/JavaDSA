package Misc;

public class MaxItem {
	public static void main(String[] args) {
		int[] arr = {1,2,3,55,4,5,6};
		
		System.out.println(max(arr));
	}
	
	public static int max(int[]arr)
	{
		int max = arr[0];
		for(int i =0;i<arr.length;i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		
		return max;
		
	}
	
	public static void print(int arr[]) {
		
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}
	
}
