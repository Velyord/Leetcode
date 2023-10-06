/*
Task:
    Given an integer x, return true if x is a palindrome, and false otherwise.
Example 1:
    Input: x = 121
    Output: true
    Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:
    Input: x = -121
    Output: false
    Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:
    Input: x = 10
    Output: false
    Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
Constraints:
    -231 <= x <= 231 - 1
 */
package src;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

public class PalindromeNumber9 {
    public static void main(String[] args) {
        out.println("Your Output:");
        out.println(isPalindrome(121));
        out.println(isPalindrome(-121));
        out.println(isPalindrome(10));
        out.println("\nExpected Output:\ntrue\nfalse\nfalse");
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        List<Integer> numList = new ArrayList<>();

        while (x>0) {
            numList.add(x % 10);
            x /= 10;
        }

        for (int i = 0; i < numList.size() / 2; i++) {
            if (numList.get(i) != numList.get(numList.size()-i-1)) {
                return false;
            }
        }

        return true;
    }
}