package tests;

import org.junit.jupiter.api.Test;
import src.PalindromeNumber9;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeNumber9Test {

    @Test
    public void test1IsPalindrome() {
        assertTrue(PalindromeNumber9.isPalindrome(121), "121");
    }

    @Test
    public void test2IsPalindrome() {
        assertFalse(PalindromeNumber9.isPalindrome(-121), "-121");
    }

    @Test
    public void test3IsPalindrome() {
        assertFalse(PalindromeNumber9.isPalindrome(10), "10");
    }
}