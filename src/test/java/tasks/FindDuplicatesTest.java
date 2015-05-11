package tasks;

import junit.framework.Assert;

import org.junit.Test;

public class FindDuplicatesTest {

	@Test
	public void testFindDuplicates() {
		Assert.assertEquals(6,
				FindDuplicates.getDuplicate(new int[] { 1, 2, 6, 4, 5, 11, 6, 8 }));
	}
}
