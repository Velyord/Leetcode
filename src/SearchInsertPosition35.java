/*
Task:
    Given a sorted array of distinct integers and a target value, return the index if the target is found.
    If not, return the index where it would be if it were inserted in order.
    You must write an algorithm with O(log n) runtime complexity.
Example 1:
    Input: nums = [1,3,5,6], target = 5
    Output: 2
Example 2:
    Input: nums = [1,3,5,6], target = 2
    Output: 1
Example 3:
    Input: nums = [1,3,5,6], target = 7
    Output: 4
Constraints:
    1 <= nums.length <= 104
    -104 <= nums[i] <= 104
    nums contains distinct values sorted in ascending order.
    -104 <= target <= 104
 */
package src;

import static java.lang.System.out;

public class SearchInsertPosition35 {
    public static void main(String[] args) {
        out.println("Your Output:");
        out.println(searchInsert(new int[] {1, 3, 5, 6}, 5));
        out.println(searchInsert(new int[] {1, 3, 5, 6}, 2));
        out.println(searchInsert(new int[] {1, 3, 5, 6}, 7));
        out.println("\nExpected Output:\n2\n1\n4");
    }

    public static int searchInsert(int[] nums, int target) {
        int index = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] >= target) {
                    index = i;
                    break;
                }
            }
        }

        if (index == -1) {
            return nums.length;
        }

        return index;
    }
}
