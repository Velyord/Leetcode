/*
Task:
    Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
Example 1:
    Input: haystack = "sadbutsad", needle = "sad"
    Output: 0
    Explanation: "sad" occurs at index 0 and 6.
    The first occurrence is at index 0, so we return 0.
Example 2:
    Input: haystack = "leetcode", needle = "leeto"
    Output: -1
    Explanation: "leeto" did not occur in "leetcode", so we return -1.
Constraints:
    1 <= haystack.length, needle.length <= 104
    haystack and needle consist of only lowercase English characters.
 */
package src;

import static java.lang.System.out;

public class FindTheIndexOfTheFirstOccurrenceInAString28 {
    public static void main(String[] args) {
        out.println("Your Output:");
        out.println(strStr("sadbutsad", "sad"));
        out.println(strStr("leetcode", "leeto"));
        out.println("\nExpected Output:\n0\n-1");
    }

    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
