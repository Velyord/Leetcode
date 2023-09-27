package src;

import java.util.Arrays;
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
        for(int i=0; i<nums.length-1; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }

        return null;
    }
}
