package tasks;

/**
 * Write a program to find top two maximum numbers in the given array. You
 * should not use any sorting functions. You should iterate the array only once.
 * You should not use any kind of collections in java.
 *
 * @author Stelio
 *
 */
public class SecondTopInteger {

	public static int[] getSecondTopNumbers(int[] n) {
		int max = 0;
		int secondMax = 0;

		for (int i = 0; i < n.length; i++) {
			if (n[i] > max) {
				secondMax = max;
				max = n[i];
			} else if (secondMax < n[i]) {
				secondMax = n[i];
			}
		}

		return new int[] { max, secondMax };
	}

}
