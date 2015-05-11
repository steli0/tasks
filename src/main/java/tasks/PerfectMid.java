package tasks;

/**
 * You are given an array of numbers. Find out the array index or position where
 * sum of numbers preceding the index is equals to sum of numbers succeeding
 * the index.
 *
 * @author Stelio
 *
 */
public class PerfectMid {

	public static void main(String[] args) {

	}

	public static int findPerfectMid(int[] arr) {
		int startSum = 0;
		int endSum;

		for (int i = 0; i < arr.length; i++) {
			startSum += arr[i];
			endSum = 0;

			for (int j = arr.length - 1; j > i; j--) {
				endSum += arr[j];
			}

			if (startSum == endSum) {
				return i+1;
			}
		}

		return -1;
	}

}
