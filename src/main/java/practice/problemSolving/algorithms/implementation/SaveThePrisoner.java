/*
Complete the saveThePrisoner function in the editor below. It should return an integer representing the chair number of the
prisoner to warn.

saveThePrisoner has the following parameter(s):

n: an integer, the number of prisoners
m: an integer, the number of sweets
s: an integer, the chair number to begin passing out sweets from
 */
package practice.problemSolving.algorithms.implementation;

import java.util.Scanner;

public class SaveThePrisoner {

    static int saveThePrisoner(int n, int m, int s) {
        int result = s + m - 1;
        if(result > n){
            if(result % n == 0){
                return n;
            }
            return result % n;
        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++){

            int n = scanner.nextInt();

            int m = scanner.nextInt();

            int s = scanner.nextInt();

            int result = saveThePrisoner(n, m, s);
            System.out.println(result);
        }
        scanner.close();
    }
}
