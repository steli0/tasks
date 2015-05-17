package tasks;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a string, find the longest substrings without repeating characters.
 * Iterate through the given string, find the longest maximum substrings.
 *
 * @author Stelio
 *
 */
public class FindDistinct {

	public static String getDistinct(String s) {
		char[] textAsChar = s.toCharArray();
		String max = "";
		List<Character> temp = new ArrayList<Character>();

		for (int i = 0; i < textAsChar.length; i++) {
			if (temp.contains(textAsChar[i])) {

				if (max.length() < temp.size()) {
					max = extend(temp);
				}
				temp.clear();

			} else {
				temp.add(temp.size(), textAsChar[i]);
			}
		}

		return max;
	}

	public static String extend(List<Character> chars) {
		StringBuilder tempBuilder = new StringBuilder();
		for (Character c : chars) {
			tempBuilder.append(c);
		}
		return tempBuilder.toString();
	}

}
