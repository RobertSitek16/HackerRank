/*
A string containing only parentheses is balanced if the following is true:

1. if it is an empty string,
2. if A and B are correct, AB is correct,
3. if A is correct, (A) and {A} and [A] are also correct.

Examples of some correctly balanced strings are: "{}()", "[{()}]", "({()})"

Examples of some unbalanced strings are: "{}(", "({)}", "[[", "}{" etc.

Given a string, determine if it is balanced or not.
 */
package practice.java.dataStructures;

import java.util.Scanner;

public class JavaStack {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String input = scanner.next();
            while(input.length() != (input = input.replaceAll("\\(\\)|\\[\\]|\\{\\}", "")).length());
            System.out.println(input.isEmpty());
        }
    }
}
