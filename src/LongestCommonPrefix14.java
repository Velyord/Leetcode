/*
Task:
    Write a function to find the longest common prefix string amongst an array of strings.
    If there is no common prefix, return an empty string "".
Example 1:
    Input: strs = ["flower","flow","flight"]
    Output: "fl"
Example 2:
    Input: strs = ["dog","racecar","car"]
    Output: ""
    Explanation: There is no common prefix among the input strings.
Constraints:
    1 <= strs.length <= 200
    0 <= strs[i].length <= 200
    strs[i] consists of only lowercase English letters.
 */
package src;

import static java.lang.System.out;

public class LongestCommonPrefix14 {
    public static void main(String[] args) {
        out.println("Your Output:");
        out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
        out.println(longestCommonPrefix(new String[]{"dog","racecar","car"}));
        out.println(longestCommonPrefix(new String[]{"ab","a"}));
        out.println("\nExpected Output:\nfl\na");
    }

    public static String longestCommonPrefix(String[] strs) {
        String lcp = strs[0];

        for (int i=1; i<strs.length; i++) {
            for (int j=0; j<lcp.length(); j++) {
                if (j < strs[i].length()) {
                    if (strs[i].charAt(j) != lcp.charAt(j)) {
                        lcp = lcp.substring(0, j);
                    }
                } else {
                    lcp = lcp.substring(0, j);
                }
            }
        }

        return lcp;
    }
}
