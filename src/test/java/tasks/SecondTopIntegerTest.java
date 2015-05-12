package tasks;

import org.junit.Assert;
import org.junit.Test;

public class SecondTopIntegerTest {

	@Test
	public void testGetSecondTopNumbers() {
		Assert.assertArrayEquals(new int[] {13, 11},
				SecondTopInteger.getSecondTopNumbers(new int[] { 9, 5, 7, 11, 2, 13, 8 }));
	}

}
