package tasks;

/**
 * Write a program to reverse a number using numeric operations. Below example
 * shows how to reverse a number using numeric operations.
 *
 * @author Stelio
 *
 */
public class ReverseNumber {
    
    public static void main(String[] args) {
        System.out.println(reverse(23431));
    }

	public static int reverse(int num) {
		int reversed = 0;

		while (num != 0) {
			reversed = reversed * 10 + num % 10;
			num /= 10;
		}

		return reversed;
	}

}
