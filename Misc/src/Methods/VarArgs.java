package Methods;

import java.util.Arrays;

public class VarArgs {
	public static void main(String[] args) {
		fun(1,2,3,4,5);
		fun(1,2,"Edwin","Joe","Shmore");
	}
	
	static void fun(int ...v) {
		System.out.println(Arrays.toString(v));
	}
	static void fun(int a, int b ,String ...v) {
		
		System.out.println(a+b+Arrays.toString(v));
	}
}
