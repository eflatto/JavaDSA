package week1;

import java.util.List;

public class PlusMinus {
//	Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero. Print the decimal value of each fraction on a new line with  places after the decimal.

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
    
    //declare variables for each ratio
    double positiveRatio = 0;
    double negativeRatio = 0;
    double zeroRatio= 0;
    
    for(int i : arr){
        if(i>0) positiveRatio++;
        if(i<0) negativeRatio++;
        if(i==0)zeroRatio++;
    }
    positiveRatio/=arr.size();
    negativeRatio/=arr.size();
    zeroRatio/=arr.size();
    System.out.printf("%1.6f\n%1.6f\n%1.6f\n",positiveRatio,negativeRatio,zeroRatio);

    }


}
