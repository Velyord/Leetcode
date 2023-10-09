/*
Task:
    Given a string s consisting of words and spaces, return the length of the last word in the string.
    A word is a maximal substring consisting of non-space characters only.
Example 1:
    Input: s = "Hello World"
    Output: 5
    Explanation: The last word is "World" with length 5.
Example 2:
    Input: s = "   fly me   to   the moon  "
    Output: 4
    Explanation: The last word is "moon" with length 4.
Example 3:
    Input: s = "luffy is still joyboy"
    Output: 6
    Explanation: The last word is "joyboy" with length 6.
Constraints:
    1 <= s.length <= 104
    s consists of only English letters and spaces ' '.
    There will be at least one word in s.
 */
package src;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

public class LengthOfLastWord58 {
    public static void main(String[] args) {
        out.println("Your Output:");
        out.println(lengthOfLastWord("Hello World"));
        out.println(lengthOfLastWord("   fly me   to   the moon  "));
        out.println(lengthOfLastWord("luffy is still joyboy"));
        out.println("\nExpected Output:\n5\n4\n6");
    }

    public static int lengthOfLastWord(String s) {
        List<String> stringWords = new ArrayList<>(List.of(s.split("\\s+")));

        return stringWords.get(stringWords.size()-1).length();
    }
}
