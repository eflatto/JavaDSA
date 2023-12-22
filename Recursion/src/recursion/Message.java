package recursion;

public class Message {
	public static void main(String[] args) {
		printMessage(5);
		
	}
	
	static void printMessage(int num) {
		if(num<=0) {
			return;
		}
		System.out.println("Hello World");
		printMessage(num-1);
	}

}
