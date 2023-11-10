package kyu8;

public class CalculateAverage {
		  public static double find_average(int[] array){
		    double sum = 0;
		    for(int i = 0;i<array.length;i++){
		      sum+=array[i];
		    }
		    return sum/array.length;
		  }
}