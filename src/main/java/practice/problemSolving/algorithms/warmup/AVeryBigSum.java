package practice.problemSolving.algorithms.warmup;

import java.util.Scanner;

public class AVeryBigSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n = scanner.nextInt();
        long[] tab = new long[n];
        System.out.println("Enter the numbers");
        for (int i = 0; i < n; i++) {
            long numbers = scanner.nextLong();
            tab[i] = numbers;
        }
        long sumFromTab = 0;
        for (int i = 0; i < n; i++){
            sumFromTab = sumFromTab + tab[i];
        }
        System.out.println(sumFromTab);
    }
}