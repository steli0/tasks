package tasks;

/**
 * Write a program to reverse a string using recursive methods. You should not
 * use any string reverse methods to do this.
 *
 * @author Stelio
 *
 */
public class ReverseString {
	static String m = "";

	public static void main(String[] args) {
		reverse("string");
	}

	public static String reverse(String s) {

		if (s.length() == 1) {
			return s;
		} else {
			m += s.charAt(s.length() - 1)
					+ reverse(s.substring(0, s.length() - 1));
			return m;
		}
	}

}
