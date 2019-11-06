package practice.java.strings;

import java.util.Scanner;

public class JavaStringsIntroduction {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        String expectedA = A.substring(0, 1).toUpperCase() + A.substring(1).toLowerCase();
        String expectedB = B.substring(0, 1).toUpperCase() + B.substring(1).toLowerCase();
        String expectedValue = expectedA.concat(" ").concat(expectedB);

        System.out.println(A.length() + B.length());

        int actualValue = A.compareTo(B);
        if (actualValue <= 0){
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }

        System.out.println(expectedValue);
    }
}
