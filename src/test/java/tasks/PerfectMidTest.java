package tasks;

import org.junit.Assert;
import org.junit.Test;

public class PerfectMidTest {

	@Test
	public void testFindPerfectMid() {
		Assert.assertEquals(3,
				PerfectMid.findPerfectMid(new int[] { 3, 4, 2, 5, 1, 3 }));
	}

}
