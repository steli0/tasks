package tasks;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import tasks.IntervalMerger.Range;

public class IntervalMergerTest {

	@Test(expected = NullPointerException.class)
	public void whenNullParameterIsPassedThenExceptionIsThrown() {
		IntervalMerger.getMergeRanges(null);
	}

	@Test
	public void getMergeRangesTest() {
		Range[] ranges = {
				new Range(5, 13),
				new Range(27, 39),
				new Range(8, 19),
				new Range(31, 37),
				new Range(45, 50),
				new Range(46, 58)
		};
		Range[] expected = {
				new Range(5, 19),
				new Range(27, 39),
				new Range(45, 58)
		};

		Assert.assertArrayEquals(expected, IntervalMerger.getMergeRanges(ranges));
	}

}
