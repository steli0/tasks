package tasks;

import java.util.Arrays;

public class BinarySearchIntegers {
	public static void main(String[] args) {
		BinarySearchClass bs = new BinarySearchClass(
				new int[]{ 5, 8, 12, 23, 34, 36, 39, 56, 87, 102, 113, 156 });

		System.out.println("Is 34 in the array? " + bs.find(34));
		System.out.println("Is 101 in the array? " + bs.find(101));
	}

	static class BinarySearchClass {
		int[] numbersArray;

		public BinarySearchClass(int[] numbers) {
			numbersArray = numbers;
		}

		boolean find(int number) {
			int[] temp = numbersArray;
			int len, mid;

			do {
				len = temp.length;
				mid = len / 2;

				if (number == temp[mid]) {
					return true;
				} else if (number > temp[mid]) {
					temp = Arrays.copyOfRange(temp, mid, len);
				} else {
					temp = Arrays.copyOfRange(temp, 0, mid);
				}
			} while (len > 1);

			return false;
		}
	}
}
