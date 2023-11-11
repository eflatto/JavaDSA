package fundamentals;

public class LinearSearch {
	
	public static void main(String[] args) {
		int[] intArr = {20,32,43,65,78,98,12,34,56};
		
		System.out.println(linearSearch(intArr, 32));
	}
	
	//search item return index of item in array or -1 if not found
	public static int linearSearch(int arr[],int value) {
		if(arr.length == 0)return -1;
		
		for(int i =0;i<arr.length;i++) {
			if(arr[i]==value) {
				return i;
			}
			
		}
		return -1;
		
	}
}
