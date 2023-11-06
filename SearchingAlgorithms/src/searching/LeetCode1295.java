package searching;

public class LeetCode1295 {
	
	//leetcode.com/problems/find-numbers-with-even-number-of-digits/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,400000,4000};
		System.out.println(findNumbers(arr));
	
	}
	
	




    public  static int findNumbers(int[] nums) {
        int count = 0;
        for(int i =0;i<nums.length;i++){
            String num =String.valueOf(nums[i]);
            
            if(num.length()%2==0){
                count++;
            }
        }
        return count;
    }
}

//
//class Solution {
//    public int findNumbers(int[] nums) {
//        int count = 0;
//        for(int i =0;i<nums.length;i++){
//            String num = nums[i]+"";
//            if(num.length()%2==0){
//                count++;
//            }
//        }
//        return count;
//    }
//}
