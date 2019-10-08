package diagonalDifferenceInArray;

import java.util.Random;
import java.util.Scanner;

public class DiagonalDifference {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the arrays");
        int n = scanner.nextInt();
        Random argument = new Random();
        int sumDiagonalFromLeft = 0;
        int sumDiagonalFromRight = 0;
        int [] [] arr = new int[n] [n];
        for (int i = 0; i <arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = argument.nextInt(200)-100;
                System.out.print((arr[i][j]) + " ");
                if (i==j) {
                    sumDiagonalFromLeft += arr[i][j];
                }
                if (n - 1 == i + j) {
                    sumDiagonalFromRight += arr[i][arr[j].length - 1 - i];
                }
            }
            System.out.println();
        }
        int abs = Math.abs(sumDiagonalFromLeft-sumDiagonalFromRight);
        System.out.println();
        System.out.println("The absolute difference between the sums of the matrix's two diagonals as a single integer: " + abs);
    }
}
