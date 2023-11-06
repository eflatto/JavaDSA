package searching;


public class MaxIn2DArray {
	public static void main(String[] args) {
		int[][] arr  = {
				{ 23,4,1 },
				{18,12,3,9},
				{78,99,34,56 },
				{ 18,12 }	
		};
		
		
		
		System.out.println(findMax(arr));
	}
	
	static int findMax(int[][] arr) {
		int max = arr[0][0];
		for(int row = 0;row<arr.length;row++) {
			for(int col = 0;col<arr[row].length;col++) {
				if(max<arr[row][col]) {
					max = arr[row][col];
				}
			}
		}
		return max;
	}
}
