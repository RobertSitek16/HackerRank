package practice.interviewPreparationKit.arrays;

import java.util.Scanner;

public class ArraysLeftRotation {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int [] a = new int[scanner.nextInt()];
        int d = scanner.nextInt();
        for (int i = 0; i < a.length; i++){
            int rotation = (i + (a.length - d)) % a.length;
            a[rotation] = scanner.nextInt();
        }
        for (int result: a) {
            System.out.print(result + " ");
        }
    }
}
