package tasks;

import org.junit.Assert;
import org.junit.Test;

public class ReverseStringTest {

	@Test
	public void testReverse() {
		Assert.assertEquals("rehtea", ReverseString.reverse("aether"));
	}

}
