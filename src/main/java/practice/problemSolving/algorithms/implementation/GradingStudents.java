package practice.problemSolving.algorithms.implementation;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class GradingStudents {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students");
        int numberOfStudents = 0;
        try {
            numberOfStudents = scanner.nextInt();
            if (numberOfStudents < 1 || numberOfStudents > 60){
                throw new IllegalArgumentException();
            }
        }
        catch (IllegalArgumentException e) {
            System.out.println("The number of students must be greater than 0 and less than 61");
            numberOfStudents = scanner.nextInt();
        }

        Integer [] finalGrade = new Integer[numberOfStudents];

        for (int i = 0; i < finalGrade.length; i++) {
            try {
                System.out.println("Please enter the note for " + (i + 1) + " student");
                finalGrade[i] = scanner.nextInt();
                if (finalGrade[i] > 100 || finalGrade[i] < 0){
                    throw new IllegalArgumentException();
                }

            } catch (IllegalArgumentException e){
                System.out.println("Please enter a number less than or equal to 100");
                finalGrade[i] = scanner.nextInt();
            }
            if (finalGrade[i] <= 100) {
                if (finalGrade[i] >= 38) {
                    if ((finalGrade[i] + 2) % 5 == 0) {
                        finalGrade[i] = finalGrade[i] + 2;
                    } else if ((finalGrade[i] + 1) % 5 == 0) {
                        finalGrade[i] = finalGrade[i] + 1;
                    }
                }
            }
        }

        Arrays.sort(finalGrade, Collections.reverseOrder());

        for (int showMeArray: finalGrade) {
            System.out.println(showMeArray);
        }
    }
}
