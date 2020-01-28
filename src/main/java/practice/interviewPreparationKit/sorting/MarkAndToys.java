/*
Mark and Jane are very happy after having their first child. Their son loves toys, so Mark wants to buy some. There are a
number of different toys lying in front of him, tagged with their prices. Mark has only a certain amount to spend, and he wants
to maximize the number of toys he buys with this money.

Complete the function maximumToys in the editor below. It should return an integer representing the maximum number of
toys Mark can purchase.

maximumToys has the following parameter(s):

prices: an array of integers representing toy prices
k: an integer, Mark's budget
 */
package practice.interviewPreparationKit.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MarkAndToys {
    // Complete the maximumToys function below.
    static int maximumToys(int[] prices, int k) {
        Arrays.sort(prices);
        int sum = 0;
        int result = 0;
        for (int i = 0; i < prices.length; i++){
            sum += prices[i];
            if (sum <= k){
                result++;
            } else {
                break;
            }
        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        int n = scanner.nextInt();

        int k = scanner.nextInt();

        int[] prices = new int[n];

        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }

        int result = maximumToys(prices, k);

        System.out.println(result);

        scanner.close();
    }
}
