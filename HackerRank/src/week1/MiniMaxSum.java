package week1;

import java.util.Collections;
import java.util.List;

public class MiniMaxSum {
	 public static void miniMaxSum(List<Integer> arr) {
		    // Write your code here
		    long minSum =0;
		    long maxSum=0;
		    Collections.sort(arr);
		    for(int i =1; i < arr.size(); i++ ){
		        maxSum += arr.get(i); 
		    }
		    for(int i =0; i < arr.size()-1; i++ ){
		        minSum += arr.get(i); 
		    }
		    
		    System.out.println(minSum+" "+maxSum);

		    }

}

