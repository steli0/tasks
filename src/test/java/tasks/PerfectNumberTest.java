package tasks;

import org.junit.Assert;
import org.junit.Test;

public class PerfectNumberTest {

	@Test
	public void testIsPerfectNumber() {
		Assert.assertTrue(PerfectNumber.isPerfect(28));
	}

	@Test
	public void testIsNotPerfectNumber() {
		Assert.assertFalse(PerfectNumber.isPerfect(10));
	}

}
