/*
John works at a clothing store. He has a large pile of socks that he must pair by color for sale. Given an array of integers
representing the color of each sock, determine how many pairs of socks with matching colors there are.
 */
package practice.problemSolving.algorithms.implementation;

import java.util.Arrays;
import java.util.Scanner;

public class SockMerchant {

    private static int sockMerchant(int n, int [] ar) {
        int pairs = 0;
        Arrays.sort(ar);
        for (int i = 0; i < n -1; i++){
            if (ar[i] == ar[i+1]){
                pairs = pairs + 1;
                i = i + 1;
            }
        }
        return pairs;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        int n = scanner.nextInt();

        int[] ar = new int[n];

        for (int i = 0; i < n; i++) {
            ar[i] = scanner.nextInt();
        }

        int result = sockMerchant(n, ar);

        System.out.println(result);

        scanner.close();
    }
}
