/*
Task:
    You are climbing a staircase. It takes n steps to reach the top.
    Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
Example 1:
    Input: n = 2
    Output: 2
    Explanation:
        There are two ways to climb to the top.
        1. 1 step + 1 step
        2. 2 steps
Example 2:
    Input: n = 3
    Output: 3
    Explanation:
        There are three ways to climb to the top.
        1. 1 step + 1 step + 1 step
        2. 1 step + 2 steps
        3. 2 steps + 1 step
Constraints:
    1 <= n <= 45
 */
package src;

import static java.lang.System.out;

public class ClimbingStairs70 {
    public static void main(String[] args) {
        out.println("Your Output:");
        out.println(climbStairs(1));
        out.println(climbStairs(2));
        out.println(climbStairs(3));
        out.println(climbStairs(4));
        out.println(climbStairs(5));
        out.println(climbStairs(6));
        out.println(climbStairs(45));
        out.println("\nExpected Output:\n1\n2\n3\n5\n8\n13\n1836311903");
    }

    public static int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }

//        else {
//            return climbStairs(n-1) + climbStairs(n-2);
//        }

        int one_before = 1;
        int two_before = 1;
        int total = 0;

        for (int i = 2; i <= n; i++) {
            total = one_before + two_before;
            two_before = one_before;
            one_before = total;
        }

        return total;
    }
}