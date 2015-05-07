package tasks;

import org.junit.Assert;
import org.junit.Test;

import tasks.BinarySearchIntegers.BinarySearchClass;

public class BinarySearchIntegersTest {
	private BinarySearchClass worker = new BinarySearchClass(
			new int[]{ 1, 3, 5, 8, 9, 12, 18, 20, 24, 29, 35, 80, 120 });

	@Test
	public void binarySearchFindTest() {
		Assert.assertTrue(worker.find(12));
	}
}
