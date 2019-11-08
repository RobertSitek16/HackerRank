/*
Given a string A, print Yes if it is a palindrome, print No otherwise.
 */
package practice.java.strings;

import java.util.Scanner;

public class JavaStringReverse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.next();
        String [] splitWord = A.split("", A.length());
        String reverseA = "";
        for (int i = A.length() - 1; i >= 0 ; i--){
            reverseA = reverseA + splitWord[i];
        }
        if (A.equals(reverseA)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
