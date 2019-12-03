package practice.problemSolving.algorithms.sorting;


import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class BigSorting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        BigInteger [] arrayWithNumbers = new BigInteger[n];
        for (int i = 0; i < n; i++){
            arrayWithNumbers[i] = scanner.nextBigInteger();
        }
        Arrays.sort(arrayWithNumbers);
        for (BigInteger show: arrayWithNumbers) {
            System.out.println(show);
        }
    }
}
