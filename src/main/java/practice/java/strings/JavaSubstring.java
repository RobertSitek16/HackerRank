/*
Given a string S and two indices, start and end, print a substring consisting of all characters in the
inclusive range from start to the end - 1.
 */

package practice.java.strings;

import java.util.Scanner;

public class JavaSubstring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println(S.substring(start, end));
    }
}
