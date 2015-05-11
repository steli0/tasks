package tasks;

import org.junit.Assert;
import org.junit.Test;

public class PrintPrimeIntegersTest {

	@Test
	public void testGetPrimeNumbers() {
		int[] expected = new int[] { 2, 3, 5, 7 };

		Assert.assertArrayEquals(expected, PrintPrimeIntegers.getPrimeNumbers(8));
	}

	@Test
	public void testGetDividerPrimes() {
		int[] expected = new int[] { 2, 2, 2 };

		Assert.assertArrayEquals(expected, PrintPrimeIntegers.getDividerPrimes(8));
	}

}
