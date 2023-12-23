package ArraysAndHashing;

public class MaxSubArray {
	public static void main(String[] args) {
		int arr[] = {-2,100,-5,-6,305,-1000};
		
		System.out.println(maxSubArray(arr));
	}
	
//	public static int maxSubArray(int[] nums) {
//        int max = nums[0];
//        for(int i = 0; i<nums.length;i++){
//            int currentSum = 0;
//            for(int j = i; j<nums.length;j++){
//                currentSum+=nums[j];
//
//                if(currentSum>max){
//                    max = currentSum;
//                }
//            }
//        }
//        return max;
//        
//    }
	
	static int maxSubArray(int[] nums) {
		
		int maxSoFar = nums[0];
		int currentMax =nums[0];
		
		for (int i =1;i<nums.length;i++) {
			System.out.println(currentMax+"curr");
			if(currentMax<0) {
				currentMax = 0;
			}
			currentMax += nums[i];
			
			if(currentMax>maxSoFar) {
				maxSoFar = currentMax;
			}
		}
		return maxSoFar;
		
	}

}
