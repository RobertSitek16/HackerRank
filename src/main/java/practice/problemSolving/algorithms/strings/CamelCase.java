/*
Robert wrote a sequence of words in CamelCase as a string of letters s, having the
following properties:
1. It is a concatenation of one or more words consisting of English letters.
2. All letters in the first word are lowercase.
3. For each of the subsequent words, the first letter is uppercase and rest
of the letters are lowercase.

Given s, print the number of words in s on a new line.
 */
package practice.problemSolving.algorithms.strings;

import java.util.Scanner;

public class CamelCase {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String s = scanner.nextLine();
        String[] expectedValue = s.split("[A-Z]");
        int count = expectedValue.length;
        System.out.println(count);

        scanner.close();
    }
}
