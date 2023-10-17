/*

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