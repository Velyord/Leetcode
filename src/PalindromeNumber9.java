package src;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

class PalindromeNumber9 {
    public static void main(String[] args) {
        out.println(isPalindrome(121));
        out.println(isPalindrome(-121));
        out.println(isPalindrome(10));
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