package week1;

public class TimeConversion {
	public static String timeConversion(String s) {
	    // Write your code here
	    String hour = s.substring(0,2);
	    String restOfTime = s.substring(2,8);
	    String timeOfDay = s.substring(8);
	    Integer hourInt = Integer.parseInt(hour);
	    
	    if(timeOfDay.equals("AM")){
	        switch(hourInt){
	        case 12:
	         hour = "00";
	        }
	        s = hour+restOfTime;
	    }else{
	        switch(hourInt){
	        case 1,2,3,4,5,6,7,8,9,10,11:
	         hourInt += 12;
	         break;
	        case 12:
	         hourInt = 12;
	         }
	         
	        s = hourInt.toString()+restOfTime;
	     
	    }
	    return s;

	}
}
