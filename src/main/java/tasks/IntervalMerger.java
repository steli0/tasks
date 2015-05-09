package tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Stelio
 *
 */
public class IntervalMerger {
	public static void main(String[] args) {

		Range[] ranges = {
				new Range(5, 13),
				new Range(27, 39),
				new Range(8, 19),
				new Range(31, 37),
				new Range(45, 50),
				new Range(46, 58)
		};

		for (Range range : getMergeRanges(ranges)) {
			System.out.println(range.toString());
		}

	}

	public static Range[] getMergeRanges(Range[] ranges) {
		if (ranges == null) {
			throw new NullPointerException("Parameter cannot be null");
		}

		ArrayList<Range> rangesList = new ArrayList<Range>(Arrays.asList(ranges));
		int tempStart, tempEnd;

		for (int i = 0; i < rangesList.size()- 1; i++) {

			for (int j = i + 1; j < rangesList.size(); j++) {

				if ((rangesList.get(i).start > rangesList.get(j).start && rangesList.get(i).start < rangesList.get(j).end) ||
						(rangesList.get(j).start > rangesList.get(i).start && rangesList.get(j).start < rangesList.get(i).end)) {

					if (rangesList.get(i).start < rangesList.get(j).start) {
						tempStart = rangesList.get(i).start;
					} else {
						tempStart = rangesList.get(j).start;
					}

					if (rangesList.get(i).end > rangesList.get(j).end) {
						tempEnd = rangesList.get(i).end;
					} else {
						tempEnd = rangesList.get(j).end;
					}

					Range tempRange = rangesList.get(j);
					tempRange.start = tempStart;
					tempRange.end = tempEnd;

					rangesList.remove(i);
					i--;
					break;
				}
			}
		}

		Range[] result = new Range[rangesList.size()];

		return rangesList.toArray(result);
	}

	static class Range {
		int start, end;

		public Range(int start, int end) {
			this.start = start;
			this.end = end;
		}

		@Override
		public String toString() {
			return "[" + start + ", " + end + "]";
		}

		@Override
		public boolean equals(Object obj) {
			Range other = (Range) obj;
			return this.start == other.start && this.end == other.end;
		}



	}
}
