package tasks;

public class DistinctIntegers {

	public static void main(String[] args) {

	}

	public static int getDistinctNumbersSum(int[] numbers) {
		if (numbers == null) {
			throw new NullPointerException("Parameter cannot be null");
		}

		boolean isDistinct;
		int sum = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (i == 0) {
				sum += numbers[i];
				continue;
			}

			isDistinct = true;

			for (int j = 0; j < i; j++) {
				if (numbers[i] == numbers[j]) {
					isDistinct = false;
					break;
				}
			}

			if (isDistinct) {
				sum += numbers[i];
			}
		}

		return sum;
	}

}
