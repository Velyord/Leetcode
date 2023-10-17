/*
Task:
    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    You may assume that each input would have exactly one solution, and you may not use the same element twice.
    You can return the answer in any order.
Example 1:
    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:
    Input: nums = [3,2,4], target = 6
    Output: [1,2]
Example 3:
    Input: nums = [3,3], target = 6
    Output: [0,1]
Constraints:
    2 <= nums.length <= 104
    -109 <= nums[i] <= 109
    -109 <= target <= 109
    Only one valid answer exists.
 */
package src;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static java.lang.System.out;

class TwoSum1 {
    public static void main(String[] args) {
        out.println("Your Output:");
        out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
        out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
        out.println(Arrays.toString(twoSum(new int[]{3, 3}, 6)));
        out.println("\nExpected Output:\n[0, 1]\n[1, 2]\n[0, 1]");
    }

    public static int[] twoSum(int[] nums, int target) {
        /*for(int i=0; i<nums.length-1; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }

        return null;*/

        Map<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if (seen.containsKey(diff)) {
                return new int[] {seen.get(diff), i};
            } else {
                seen.put(nums[i], i);
            }
        }

        return null;
    }
}
