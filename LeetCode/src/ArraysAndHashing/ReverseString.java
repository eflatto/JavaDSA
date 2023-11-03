package ArraysAndHashing;

public class ReverseString {
    public static void main(String[] args) {
    	String s = "hello";
        System.out.println(reverseString(s,"",s.length()-1));
    }

    static String reverseString(String s, String r, int i) {
        if (i < 0) {
            return r;
        }
        return reverseString(s, r + s.charAt(i), i - 1);
    }

}
