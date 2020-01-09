/*
You are given an array of n integers, ar = [ar[0], ar[1], ..., ar[n-1]], and a positive integer k. Find and print the
number of (i,j) pairs where i < j and ar[i] + ar[j] is divisible by k.
 */
package practice.problemSolving.algorithms.implementation;

import java.util.Scanner;

public class DivisibleSumPairs {

    private static int divisibleSumPairs(int n, int k, int[] ar) {
        int count = 0;

        for (int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++){
                    if ((ar[i] + ar[j]) % k == 0){
                        count++;
                }
            }
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();

        int k = scanner.nextInt();

        int[] ar = new int[n];

        for (int i = 0; i < n; i++) {
            ar[i] = scanner.nextInt();
        }

        int result = divisibleSumPairs(n, k, ar);

        System.out.println(result);

        scanner.close();
    }
}
