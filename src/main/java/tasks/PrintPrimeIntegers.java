package tasks;

import java.util.LinkedList;
import java.util.List;

public class PrintPrimeIntegers {

	public static void main(String[] args) {
		for (int number : getDividerPrimes(30)) {
			System.out.printf("%d ", number);
		}
	}

	public static int[] getPrimeNumbers(int n) {
		List<Integer> result = new LinkedList<Integer>();

		boolean prime;

		for (int i = 2; i < n; i++) {
			prime = true;

			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					prime = false;
					break;
				}
			}

			if (prime) {
				result.add(i);
			}
		}

		int[] resultArr = new int[result.size()];

		for (int i = 0, len = result.size(); i < len; i++) {
			resultArr[i] = result.get(i);
		}

		return resultArr;
	}

	public static int[] getDividerPrimes(int n) {
		int[] primes = getPrimeNumbers(n);
		List<Integer> result = new LinkedList<Integer>();

		for (int number : primes) {
			int temp = n;

			while (temp % number == 0) {
				result.add(number);
				temp = temp / number;
			}
		}

		int[] resultArr = new int[result.size()];

		for (int i = 0, len = result.size(); i < len; i++) {
			resultArr[i] = result.get(i);
		}

		return resultArr;
	}

}
