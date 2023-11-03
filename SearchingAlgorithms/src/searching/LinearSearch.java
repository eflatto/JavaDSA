package searching;

public class LinearSearch {
	
	public static void main(String[] args) {
		int[] intArr = {20,32,43,65,78,98,12,34,56};
		
		System.out.println(linearSearch(intArr, 32));
	}
	
	public static int linearSearch(int arr[],int value) {
		for(int i =0;i<arr.length;i++) {
			if(arr[i]==value) {
				return i;
			}
			
		}
		return -1;
		
	}
}
