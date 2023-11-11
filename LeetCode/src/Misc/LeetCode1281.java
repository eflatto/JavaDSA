package Misc;

public class LeetCode1281 {
	 public int subtractProductAndSum(int n) {
	        int product =1;
	        int sum = 0;
	        String nString = n+"";
	        for(int i=0;i<nString.length();i++){
	            int digit = n%10;
	            product*=digit;
	            sum+=digit;
	            n/=10;
	        }
	        return product-sum;
	    }
}
