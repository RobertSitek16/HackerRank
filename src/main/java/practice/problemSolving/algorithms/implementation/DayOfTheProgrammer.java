package practice.problemSolving.algorithms.implementation;

import java.util.Scanner;

public class DayOfTheProgrammer {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int input = scanner.nextInt();
        String result = dayOfTheProgrammer(input);
        System.out.println(result);
        scanner.close();
    }

    private static boolean isLeapYear(int year) {

        if (year % 4 != 0) {
            return false;
        }

        return year % 400 == 0 || year <= 1918 || year % 100 != 0;

    }

    private static String dayOfTheProgrammer(int year) {

        int dayOfTheSeptember;

        if (year == 1918) {
            return "26.09.1918";
        }
        if (isLeapYear(year)) {
            dayOfTheSeptember = 12;
            return dayOfTheSeptember + ".09." + year;
        } else {
            dayOfTheSeptember = 13;
            return dayOfTheSeptember + ".09." + year;
        }
    }
}
