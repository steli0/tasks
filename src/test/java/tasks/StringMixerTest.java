package tasks;

import org.junit.Assert;
import org.junit.Test;

public class StringMixerTest {
	private static String SENTENCE = "This is one short sample sentence which will show how good am I with programming";

	@Test(expected = NullPointerException.class)
	public void whenNullParameterPassedThenExceptionIsThrown() {
		StringMixer.getFuzzBuzzedString(null);
	}

	@Test
	public void whenEmptyStringParameterIsUsedThenReturnValueIsNull() {
		Assert.assertNull(StringMixer.getFuzzBuzzedString(""));
	}

	@Test
	public void checkIfEveryThirdFifthAndFiftheenthWordIsReplaced() {
		String sentence = "This is Fuzz short Buzz Fuzz which will Fuzz Buzz good Fuzz I with FuzzBuzz";

		Assert.assertEquals(sentence, StringMixer.getFuzzBuzzedString(SENTENCE));
	}
}
