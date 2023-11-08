 package MiscProblems;

public class ArmStrongNumbers {
	
	
	static boolean isArmstrong(int num) {
        int originalNumber = num;
        int numberOfDigits = (int) Math.log10(num) + 1;
        int sum = 0;

        while (num > 0) {
            int rem = num % 10;
            sum += Math.pow(rem, numberOfDigits);
            num /= 10;
        }

        return sum == originalNumber;
    }
}
