package ArraysAndHashing;

public class BestTimeToBuyandSellAStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}
//	public int maProfit(int[] prices) {
//		int largestDifference = 0;
//		
//		for(int buy)
//	}
	
	public int maxProfit(int[] prices) {
		int ans = 0;
		int minimumSoFar = prices[0];
		
		for(int i =1;i<prices.length;i++) {
			int currentProfit = prices[i] - minimumSoFar;
			if(currentProfit>ans) {
				ans = currentProfit;
			}
			minimumSoFar = Math.min(minimumSoFar, prices[i]);
		}
		return ans;
	}

}
