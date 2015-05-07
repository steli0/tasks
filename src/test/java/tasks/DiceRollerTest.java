package tasks;

import org.junit.Assert;
import org.junit.Test;

public class DiceRollerTest {

	@Test
	public void rollDiceFiveTimesTest() {
		int[] result = DiceRoller.rollDiceFiveTimes();
		Assert.assertEquals(5, result.length);
	}

	@Test
	public void calculateScoreTest() {
		Assert.assertEquals(1150,
				DiceRoller.calculateScore(new int[] { 1, 1, 1, 5, 1 }));
	}

	@Test
	public void calculateScoreTest2() {
		Assert.assertEquals(1100,
				DiceRoller.calculateScore(new int[] { 1, 1, 1, 2, 1 }));
	}

	@Test
	public void calculateScoreTest3() {
		Assert.assertEquals(0,
				DiceRoller.calculateScore(new int[] { 2, 3, 4, 6, 2 }));
	}

	@Test
	public void calculateScoreTest4() {
		Assert.assertEquals(350,
				DiceRoller.calculateScore(new int[] { 3, 4, 5, 3, 3 }));
	}

	@Test
	public void calculateScoreTest5() {
		Assert.assertEquals(250,
				DiceRoller.calculateScore(new int[] { 1, 5, 1, 2, 4 }));
	}

	@Test
	public void calculateScoreTest6() {
		Assert.assertEquals(600,
				DiceRoller.calculateScore(new int[] { 5, 5, 5, 5, 5 }));
	}
}
