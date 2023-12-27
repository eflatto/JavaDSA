package ArraysAndHashing;

public class MaxSubArray {
	public static void main(String[] args) {
		int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
		
		System.out.println(maxSubArray(arr));
	}
	
	
////n^3
//	public static int maxSubArray(int[] nums) {
//        int maxSum = nums[0];
//        
//        for(int i =0;i<nums.length;i++) {
//        	for(int j=i;j<nums.length;j++) {
//        		int currentSum = 0;
//        			for(int k = i;k<=j;k++) {
//        				currentSum += nums[k];
//        			}
//        			maxSum = Math.max(maxSum, currentSum);
//        	}
//        }
//        
//        return maxSum;
//        
//    }
	
//	public static int maxSubArray(int[] nums) {
//		int maxSum = nums[0];
//		
//		for(int i =0;i<nums.length;i++) {
//			int currentSum = 0;
//			for(int j = i;j<nums.length;j++) {
//				currentSum += nums[j];
//				maxSum = Math.max(maxSum, currentSum);
//				
//			}
//		}
//		return maxSum;
//	}
//	
	
	
	static int maxSubArray(int[] nums) {
		
		int maxSoFar = nums[0];
		int currentMax =nums[0];
		
		for (int i =1;i<nums.length;i++) {
			currentMax= Math.max(currentMax + nums[i], nums[i]);

		    maxSoFar = Math.max(maxSoFar, currentMax);
		}
		return maxSoFar;
		
	}

}
