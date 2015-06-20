package tasks;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Assert;

/**
 * Given two strings s and t, determine if they are isomorphic. Two strings are
 * isomorphic if the characters in s can be replaced to get t.
 * For example,"egg" and "add" are isomorphic, "foo" and "bar" are not.
 * 
 * @author Stelio
 *
 */
public class IsomorphicStrings {

    public static void main(String[] args) {

        Assert.assertTrue("Strings are not isomorphic",
                areIsomorphic("foo", "brr"));
        Assert.assertFalse(areIsomorphic("foo", "bar"));
    }

    public static boolean areIsomorphic(String s1, String s2) {
        if (s1 == null || s2 == null)
            return false;
        if (s1.length() != s2.length())
            return false;

        Map<Character, Character> chars = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            chars.put(s1.charAt(i), s2.charAt(i));
        }

        Set<Entry<Character, Character>> entrySet = chars.entrySet();
        for (Entry<Character, Character> entry : entrySet) {
            char key = entry.getKey();
            char value = entry.getValue();
            for (int i = 0; i < s1.length(); i++) {
                if (key == s1.charAt(i)) {
                    if (value != s2.charAt(i)) {
                        return false;
                    }
                }
            }
        }

        return true;
    }

}
