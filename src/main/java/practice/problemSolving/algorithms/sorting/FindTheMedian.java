package practice.problemSolving.algorithms.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class FindTheMedian {

    static int findMedian(int[] arr) {
        Arrays.sort(arr);
        int median = arr[arr.length/2];
        return median;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int result = findMedian(arr);
        System.out.println(result);

        scanner.close();
    }
}
