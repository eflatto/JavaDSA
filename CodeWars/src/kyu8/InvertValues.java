package kyu8;

public class InvertValues {
	
		  public static int[] invert(int[] array) {
		  int ans[] = new int[array.length];
		  for(int i =0;i<array.length;i++){
		    ans[i]=array[i]*(-1);
		  }
		  return ans;
		  }
		
}
