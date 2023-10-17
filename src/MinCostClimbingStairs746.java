/*
Task:
    You are given an integer array cost where cost[i] is the cost of ith step on a staircase.
    Once you pay the cost, you can either climb one or two steps.
    You can either start from the step with index 0, or the step with index 1.
    Return the minimum cost to reach the top of the floor.
Example 1:
    Input: cost = [10,15,20]
    Output: 15
    Explanation:
        You will start at index 1.
        - Pay 15 and climb two steps to reach the top.
        The total cost is 15.
Example 2:
    Input: cost = [1,100,1,1,1,100,1,1,100,1]
    Output: 6
    Explanation:
        You will start at index 0.
        - Pay 1 and climb two steps to reach index 2.
        - Pay 1 and climb two steps to reach index 4.
        - Pay 1 and climb two steps to reach index 6.
        - Pay 1 and climb one step to reach index 7.
        - Pay 1 and climb two steps to reach index 9.
        - Pay 1 and climb one step to reach the top.
        The total cost is 6.
Constraints:
    2 <= cost.length <= 1000
    0 <= cost[i] <= 999
 */
package src;

import java.util.Arrays;

import static java.lang.System.out;

public class MinCostClimbingStairs746 {
    public static void main(String[] args) {
        out.println("Your Output:");
        out.println(minCostClimbingStairs(new int[]{10, 15, 20}));
        out.println(minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
        out.println(minCostClimbingStairs(new int[]{0, 0, 1, 1}));
        out.println(minCostClimbingStairs(new int[]{0, 1, 1, 0}));
        out.println(minCostClimbingStairs(new int[]{0, 1, 2, 2}));
        out.println(minCostClimbingStairs(new int[]{1, 5, 2, 4, 1, 8, 3, 6, 7}));
        out.println("\nExpected Output:\n15\n6\n1\n1\n2\n13");
    }

    public static int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length + 1];

        dp[dp.length - 1] = 0;
        dp[dp.length - 2] = cost[cost.length-1];

        for (int i = dp.length - 3; i >=0; i--) {
            dp[i] = cost[i] + Math.min(dp[i + 1], dp[i + 2]);
        }

        return Math.min(dp[0], dp[1]);
    }
}