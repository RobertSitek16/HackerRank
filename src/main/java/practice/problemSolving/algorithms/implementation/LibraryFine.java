/*
Your local library needs your help! Given the expected and actual return dates for a library book, create a program that
calculates the fine(if any). The fee structures is as follows:
1. If the book is returned on or before the expected return date, no fine will be charged.
2. If the book is returned after the expected return day but still within the same calendar month and year as the expected
return date, fine = 15 x (the number of days late).
3. If the book is returned after the expected return month but still within the same calendar year as the expected return date,
the fine = 500 x (the number of months late).
4. If the book is returned after the calendar year in which it was expected, there is a fixed fine of 10 000.
 */
package practice.problemSolving.algorithms.implementation;

import java.time.LocalDate;
import java.util.Scanner;

public class LibraryFine {

    private static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        LocalDate actualDate = LocalDate.of(y1, m1, d1);
        LocalDate expectedDate = LocalDate.of(y2, m2, d2);
        if (actualDate.getYear() > expectedDate.getYear()){
            return 10000;
        } else if (actualDate.getYear() < expectedDate.getYear()){
            return 0;
        }
        if(actualDate.getMonthValue() > expectedDate.getMonthValue()){
            return 500 * (m1 - m2);
        } else if (actualDate.getMonthValue() < expectedDate.getMonthValue()){
            return 0;
        }
        if (actualDate.getDayOfMonth() > expectedDate.getDayOfMonth()){
            return 15 * (d1 - d2);
        }
        return 0;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int d1 = scanner.nextInt();

        int m1 = scanner.nextInt();

        int y1 = scanner.nextInt();;

        int d2 = scanner.nextInt();

        int m2 = scanner.nextInt();

        int y2 = scanner.nextInt();

        int result = libraryFine(d1, m1, y1, d2, m2, y2);

        System.out.println(result);

        scanner.close();
    }
}
