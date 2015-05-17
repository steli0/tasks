package tasks;

import org.junit.Assert;
import org.junit.Test;

public class FindDistinctTest {

	@Test
	public void testGetDistinct() {
		Assert.assertEquals("asdfe",
				FindDistinct.getDistinct("jkkasdfeewbbrrqkll"));
	}

}
