package src;

import static java.lang.System.out;

public class FindTheIndexOfTheFirstOccurrenceInAString28 {
    public static void main(String[] args) {
        out.println("Your Output:");
        out.println(strStr("sadbutsad", "sad"));
        out.println(strStr("leetcode", "leeto"));
        out.println("\nExpected Output:\n0\n-1");
    }

    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
