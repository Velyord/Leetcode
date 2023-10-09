/*
Task:
    Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
    You must not use any built-in exponent function or operator.
    For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
Example 1:
    Input: x = 4
    Output: 2
    Explanation: The square root of 4 is 2, so we return 2.
Example 2:
    Input: x = 8
    Output: 2
    Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.
Constraints:
    0 <= x <= 231 - 1
 */
package src;

import static java.lang.System.out;

public class SqrtX69 {
    public static void main(String[] args) {
        out.println("Your Output:");
        out.println(mySqrt(4));
        out.println(mySqrt(8));
        out.println(mySqrt(2147395600));
        out.println("\nExpected Output:\n2\n2\n46340");
    }

    public static int mySqrt(int x) {
        for(int i=0; true; i++) {
            if((long) i * i > x) {
                return i - 1;
            }
        }
    }
}
