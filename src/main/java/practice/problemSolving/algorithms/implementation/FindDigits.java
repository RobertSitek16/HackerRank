/*
An integer d is ad divisor of an integer n if the remainder of n/d =0.
Given an integer, for each digit that makes up the integer determine whether it is a divisor.
Count the number of divisors occurring within the integer.
 */
package practice.problemSolving.algorithms.implementation;

import java.util.Scanner;

public class FindDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrayWithNumbersAsString = new String[scanner.nextInt()];

        for (int i = 0; i < arrayWithNumbersAsString.length; i++) {
            int count = 0;
            arrayWithNumbersAsString[i] = scanner.next();
            String[] numbersAfterSplit = arrayWithNumbersAsString[i].split("");

            for (int j = 0; j < numbersAfterSplit.length; j++) {
                int[] arrayWithNumberAsInt = new int[arrayWithNumbersAsString.length];
                int[] numbersAfterSplitAsInt = new int[numbersAfterSplit.length];

                arrayWithNumberAsInt[i] = Integer.parseInt(arrayWithNumbersAsString[i]);
                numbersAfterSplitAsInt[j] = Integer.parseInt(numbersAfterSplit[j]);

                if (numbersAfterSplitAsInt[j] > 0) {
                    if (arrayWithNumberAsInt[i] % numbersAfterSplitAsInt[j] == 0) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
