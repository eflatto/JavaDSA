package Strings;

public class RemoveLetter {
	public static void main(String[] args) {
		removeLetters("","eabcdfescf");
		
	}
	
	static void removeLetters(String p,String up) {
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		
		char ch = up.charAt(0);
		
		if(ch == 'a') {
			removeLetters(p,up.substring(1));
		}else {
			removeLetters(p+ch,up.substring(1));
			
		}
		
		
	
		
	}

}
