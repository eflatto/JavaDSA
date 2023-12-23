package Strings;

public class LongestCommonPrefix {
	public static void main(String[] args) {
		
	}
	
	static String longestCommonPrefix(String[] str) {
		
		if (str == null || str.length == 0) {
            return "";
        }
		
		String shortestString = str[0];
		
		for(String currentString : str) {
			if(currentString.length() < shortestString.length()) {
				shortestString = currentString;
			}
		}
		
		for(int i =0;i<shortestString.length();i++) {
			char test = str[0].charAt(i);
			
			for(String y: str) {
				if(y.charAt(i)!=test)return shortestString.substring(0,i);
			}
			
		}
		return shortestString;
		
	}

}
