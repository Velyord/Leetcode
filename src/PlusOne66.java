/*

 */
package src;

import java.util.Arrays;

import static java.lang.System.out;

public class PlusOne66 {
    public static void main(String[] args) {
        out.println("Your Output:");
        out.println(Arrays.toString(plusOne(new int[]{1, 2, 3})));
        out.println(Arrays.toString(plusOne(new int[]{4, 3, 2, 1})));
        out.println(Arrays.toString(plusOne(new int[]{9})));
        out.println("\nExpected Output:\n[1, 2, 4]\n[4, 3, 2, 2]\n[1, 0]");
    }

    public static int[] plusOne(int[] digits) {
        digits[digits.length-1]++;

        for (int i = digits.length-1; i>0; i--) {
            if (digits[i] == 10) {
                digits[i] = 0;
                digits[i-1]++;
            }
        }

        if (digits[0] == 10) {
            digits[0] = 0;
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = 1;

            for (int i = 0; i < digits.length; i++) {
                newDigits[i + 1] = digits[i];
            }

            return newDigits;
        }

        return digits;
    }
}
