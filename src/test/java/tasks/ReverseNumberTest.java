package tasks;

import org.junit.Assert;
import org.junit.Test;

public class ReverseNumberTest {

	@Test
	public void testReverse() {
		Assert.assertEquals(5678, ReverseNumber.reverse(8765));
	}
}
