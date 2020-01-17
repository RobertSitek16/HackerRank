/*
Dan is playing a video game in which his character competes in a hurdle race. Hurdles are of varying heights, and Dan has a
maximum height he can jump. There is a magic potion he can take that will increase his maximum height by 1 unit for each
dose. How many doses of the potion must he take to be able to jump all of the hurdles.

Given an array of hurdle heights "height", and an initial maximum height Dan can jump k, determine the minimum number
of doses Dan must take to be able to clear all the hurdles in the race.
 */
package practice.problemSolving.algorithms.implementation;

import java.util.Scanner;

public class TheHurdleRace {

    static int hurdleRace(int k, int[] height) {
        int max = 0;
        for (int i = 0; i < height.length; i++){
            if (height[i] > max){
                max = height[i];
            }
        }
        if (k > max){
            return 0;
        } else {
            return max - k;
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();

        int k = scanner.nextInt();

        int[] height = new int[n];

        for (int i = 0; i < n; i++) {
            height[i] = scanner.nextInt();
        }

        int result = hurdleRace(k, height);

        System.out.println(result);

        scanner.close();
    }
}
