package searching;

public class FindMin {
	public static void main(String[] args) {
		int[] arr = {5,100,55,88};
		System.out.println(findMin(arr));
	}
	
	public static int findMin(int[] arr) {
		int min = arr[0];
		for(int i = 0;i<arr.length;i++) {
			if(min>arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}
	
}
