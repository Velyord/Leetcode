package src;

import static java.lang.System.out;

public class RomanToInteger13 {
    public static void main(String[] args) {
        out.println("Your Output:");
        out.println(romanToInt("III"));
        out.println(romanToInt("LVIII"));
        out.println(romanToInt("MCMXCIV"));
        out.println("\nExpected Output:\n3\n58\n1994");
    }

    public static int romanToInt(String s) {
        int result = 0;

        for (int i=0; i<s.length(); i++) {
            if (i != s.length() - 1) {
                if (s.charAt(i) == 'I' && s.charAt(i+1) == 'V') {
                    result += 4;
                    i++;
                    continue;
                } else if (s.charAt(i) == 'I' && s.charAt(i+1) == 'X') {
                    result += 9;
                    i++;
                    continue;
                } else if (s.charAt(i) == 'X' && s.charAt(i+1) == 'L') {
                    result += 40;
                    i++;
                    continue;
                } else if (s.charAt(i) == 'X' && s.charAt(i+1) == 'C') {
                    result += 90;
                    i++;
                    continue;
                } else if (s.charAt(i) == 'C' && s.charAt(i+1) == 'D') {
                    result += 400;
                    i++;
                    continue;
                } else if (s.charAt(i) == 'C' && s.charAt(i+1) == 'M') {
                    result += 900;
                    i++;
                    continue;
                }
            }

            if (s.charAt(i) == 'M') {
                result += 1000;
            } else if (s.charAt(i) == 'D') {
                result += 500;
            } else if (s.charAt(i) == 'C') {
                result += 100;
            } else if (s.charAt(i) == 'L') {
                result += 50;
            } else if (s.charAt(i) == 'X') {
                result += 10;
            } else if (s.charAt(i) == 'V') {
                result += 5;
            } else if (s.charAt(i) == 'I') {
                result += 1;
            }
        }

        return result;
    }
}
