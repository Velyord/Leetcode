/*
Task:
    Given two binary strings a and b, return their sum as a binary string.
Example 1:
    Input: a = "11", b = "1"
    Output: "100"
Example 2:
    Input: a = "1010", b = "1011"
    Output: "10101"
Constraints:
    1 <= a.length, b.length <= 104
    a and b consist only of '0' or '1' characters.
    Each string does not contain leading zeros except for the zero itself.
 */
package src;

import static java.lang.System.out;

public class AddBinary67 {
    public static void main(String[] args) {
        out.println("Your Output:");
        out.println(addBinary("11", "1"));
        out.println(addBinary("1010", "1011"));
        out.println(addBinary("1", "111"));
        out.println(addBinary("1111", "1111"));
        out.println("\nExpected Output:\n100\n10101\n1000\n11110");
    }

    public static String addBinary(String a, String b) {
        int inMind = 0;
        StringBuilder aReversed = new StringBuilder(reverseString(a));
        StringBuilder bReversed = new StringBuilder(reverseString(b));
        StringBuilder result = new StringBuilder();

        if (a.length() > b.length()) {
            bReversed.append("0".repeat(a.length() - b.length()));
        } else {
            aReversed.append("0".repeat(b.length() - a.length()));
        }

        for (int i=0; i<aReversed.length(); i++) {
            int aPlusB = Integer.parseInt(String.valueOf(aReversed.charAt(i))) + Integer.parseInt(String.valueOf(bReversed.charAt(i)));

            if (aPlusB == 0) {
                if (inMind == 0) {
                    result.append("0");
                } else {
                    result.append("1");
                    inMind--;
                }
            } else if (aPlusB == 1) {
                if (inMind == 0) {
                    result.append("1");
                } else {
                    result.append("0");
                }
            } else {
                if (inMind == 0) {
                    result.append("0");
                    inMind++;
                } else {
                    result.append("1");
                }
            }
        }

        if (inMind != 0) {
            result.append("1");
        }

        return reverseString(result.toString());
    }

    public static String reverseString(String input) {
        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();
    }
}
