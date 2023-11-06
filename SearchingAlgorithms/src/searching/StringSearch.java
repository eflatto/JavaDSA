package searching;

public class StringSearch {

	public static void main(String[] args) {
		String name = "Edwin";
		
//		char letter = 'o';
		char letter = 'E';
		
		System.out.println(search(name, letter));
	}
	
//	static boolean search (String str,char target) {
//		if(str.length()==0)return false;
//		
//		for(int i = 0;i<str.length();i++) {
//			if(str.charAt(i)==target) {
//				return true;
//			}
//		}
//		
//		return false;
//		
//	}
	static boolean search (String str,char target) {
		if(str.length()==0)return false;
		
		for(char ch : str.toCharArray()) {
			if(ch==target) {
				return true;
			}
		}
		
		return false;
		
	}
}
