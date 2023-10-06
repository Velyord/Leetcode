/*

 */
package src;

import static java.lang.System.out;

public class ValidParentheses {
    public static void main(String[] args) {
        out.println("Your Output:");
        out.println(isValid("()"));
        out.println(isValid("()[]{}"));
        out.println(isValid("(]"));
        out.println(isValid("([)]"));
        out.println(isValid("[[[]"));
        out.println(isValid("(([]){})"));
        out.println("\nExpected Output:\ntrue\ntrue\nfalse\nfalse\nfalse\ntrue");
    }

    public static boolean isValid(String s) {
        int openRound = 0;
        int openCurly = 0;
        int openSquare = 0;
        StringBuilder braces = new StringBuilder();

        for (int i=0; i<s.length();i++) {
            braces.append(s.charAt(i));

            if (s.charAt(i) == '(') {
                openRound++;
            } else if (s.charAt(i) == '{') {
                openCurly++;
            } else if (s.charAt(i) == '[') {
                openSquare++;
            } else if (s.charAt(i) == ')' && openRound > 0 && braces.charAt(braces.length()-2) == '(') {
                openRound--;
                braces = new StringBuilder(braces.substring(0, braces.length()-2));
            } else if (s.charAt(i) == '}' && openCurly > 0 && braces.charAt(braces.length()-2) == '{') {
                openCurly--;
                braces = new StringBuilder(braces.substring(0, braces.length()-2));
            } else if (s.charAt(i) == ']' && openSquare > 0 && braces.charAt(braces.length()-2) == '[') {
                openSquare--;
                braces = new StringBuilder(braces.substring(0, braces.length()-2));
            } else {
                return false;
            }
        }

        if (openRound > 0 || openCurly > 0 || openSquare > 0) {
            return false;
        } else {
            return true;
        }
    }
}
