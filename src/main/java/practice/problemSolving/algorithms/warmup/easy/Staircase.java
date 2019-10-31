package practice.problemSolving.algorithms.warmup.easy;

import java.util.Scanner;

public class Staircase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the staircase:");
        int n = scanner.nextInt();
        System.out.println("Staircase:");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n - 1; j++){
                if (i + j < n - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("#");
                }
            }
            System.out.println("#");
        }
    }
}
