package searching;

public class LeetCode1672 {
	
	public static void main(String[] args) {
		int[][]accounts = {{1,2,3},{3,2,1}};
		System.out.println(maximumWealth(accounts));
	}
	 
	public static int maximumWealth(int[][] accounts) {
	       
	        int ans = Integer.MIN_VALUE;
	        for(int row =0;row<accounts.length;row++){
	            int maxWealth =0;
	            for(int col=0;col<accounts[row].length;col++){
	                maxWealth += accounts[row][col];
	            }
	            if(ans<maxWealth){
	                ans = maxWealth;
	            }
	        }
	        return ans;
	    }
}
