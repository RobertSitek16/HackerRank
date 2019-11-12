/*
Given a string s, matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens.
We define a token to be one or more consecutive English alphabetic letters. Then, print the number of
tokens, followed by each token on a new line.
 */

package practice.java.strings;

import java.util.Scanner;

public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        s = s.trim();
        if (s.length() == 0) {
            System.out.println("0");
            return;
        }
        String[] actualValue = s.split("[^a-zA-Z]+");
        System.out.println(actualValue.length);
        for (String print : actualValue) {
            System.out.println(print);
        }
    }
}

