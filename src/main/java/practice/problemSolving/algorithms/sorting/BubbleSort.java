package practice.problemSolving.algorithms.sorting;

import java.util.Scanner;

public class BubbleSort {

    static void countSwaps(int[] a) {
        int tmp;
        int swap = 0;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length - 1; j++){
                if(a[j] > a[j+1]){
                    tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                    swap++;
                }
            }
        }
        System.out.println("Array is sorted in " + swap + " swaps.");
        System.out.println("First element: " + a[0]);
        System.out.println("Last element: " + a[a.length-1]);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        countSwaps(a);

        scanner.close();
    }
}
