package tasks;

import org.junit.Assert;
import org.junit.Test;

public class DistinctIntegersTest {

	@Test(expected = NullPointerException.class)
	public void whenNullIsPassedAsParameterThenExceptionIsThrown() {
		DistinctIntegers.getDistinctNumbersSum(null);
	}

	@Test
	public void getDistinctNumbersArrayTest() {
		int[] a = { 1, 2, 4, 2, 5, 7, 7, 8, 2 };

		Assert.assertEquals(27, DistinctIntegers.getDistinctNumbersSum(a));
	}
}
