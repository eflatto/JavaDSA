package Misc;

public class Swap {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		
		swap(arr,1,5);
		
	}
	
	public static void swap(int[]arr,int index1,int index2)
	{
		print(arr);
		int temp = arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=temp;
		
		print(arr);
		
		
		
	}
	
	public static void print(int arr[]) {
		
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}
	
	

}
