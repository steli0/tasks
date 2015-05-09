package tasks;

public class StringMixer {
	public static void main(String[] args) {
		System.out
				.println(getFuzzBuzzedString("This is one short sample sentence, which will show how good am I with programming"));
	}

	public static String getFuzzBuzzedString(String sentence) {
		if (sentence == null) {
			throw new NullPointerException("Parameter cannot be null");
		} else if (sentence.equals("")) {
			return null;
		}

		StringBuilder result = new StringBuilder();
		String[] wordsArray = sentence.split(" ");

		for (int i = 0; i < wordsArray.length; i++) {
			if (i > 0) {
				if ((i + 1) % 15 == 0) {
					wordsArray[i] = "FuzzBuzz";
				} else if ((i + 1) % 5 == 0) {
					wordsArray[i] = "Buzz";
				} else if ((i + 1) % 3 == 0) {
					wordsArray[i] = "Fuzz";
				}
			}

			result.append(wordsArray[i]);
			if (i != wordsArray.length - 1) {
				result.append(" ");
			}
		}

		return result.toString();
	}
}
