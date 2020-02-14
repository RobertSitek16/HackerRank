package practice.problemSolving.algorithms.implementation;

import java.util.Arrays;
import java.util.Scanner;

public class BirthdayChocolate {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int [] s = new int[n];
        for (int i = 0; i < n; i++){
            s[i] = scanner.nextInt();
        }
        int day = scanner.nextInt();
        int month = scanner.nextInt();

        int sum = 0;
        for (int i = 0; i <= n - month; i++){
            if (Arrays.stream(s, i, i + month).sum() == day){
                sum++;
            }
        }
        System.out.println(sum);
    }
}
