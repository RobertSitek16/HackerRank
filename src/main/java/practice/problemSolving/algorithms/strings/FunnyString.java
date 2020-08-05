/*
In this challenge, you will determine whether a string is funny or not. To determine whether a string is funny, create a copy of
the string in reverse e.g. abc -> cba. Iterating through each string, compare the absolute difference in the ascii values of the
characters at positions 0 and 1, 1 and 2 and so on to the end. If the list of absolute differences is the same for both strings, they
are funny.
Determine whether a give string is funny. If it is, return Funny, otherwise return Not Funny.
For example, given the string s = lmnop, the ordinal values of the characters are [108, 109, 110, 111, 112]. Sreverse = ponml
and the ordinals are [112, 111, 110, 109, 108]. The absolute differences of the adjacent elements for both strings are
[1, 1, 1, 1], so the answer if Funny.
 */
package practice.problemSolving.algorithms.strings;

import java.util.Scanner;
import java.util.stream.IntStream;

public class FunnyString {

    private static String funnyString(String s) {
        char[] sAsChar = s.toCharArray();
        int[] ascii = new int[sAsChar.length];

        for (int i = 0; i < sAsChar.length; i++) {
            ascii[i] = (int) sAsChar[i];
        }

        int[] reverseAscii = IntStream.rangeClosed(1, ascii.length).map(i -> ascii[ascii.length-i]).toArray();

        for (int i = 0; i < ascii.length; i++) {
            if (i < ascii.length - 1) {
                if (Math.abs(ascii[i] - ascii[i + 1]) != Math.abs(reverseAscii[i] - reverseAscii[i + 1])) {
                    return "Not Funny";
                }
            }
        }

        return "Funny";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < q; i++) {
            String s = scanner.nextLine();
            String result = funnyString(s);
            System.out.println(result);
        }

        scanner.close();
    }
}
