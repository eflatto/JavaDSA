package kyu8;

public class CountByX {
	  public static int[] countBy(int x, int n){
		    // Your code here
		    int ans[]=new int[n];
		    int current = x;
		    for(int i =0;i<n;i++){
		      ans[i]=current ;
		      current += x;
		    }
		    return ans;
		  }
}
