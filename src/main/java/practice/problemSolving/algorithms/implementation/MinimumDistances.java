/*
We define the distance between two array values as the number of indices between the two values. Given a, find the minimum
distance between any pair of equal elements in the array. If no such value exists, print -1.

 */
package practice.problemSolving.algorithms.implementation;

import java.util.*;

public class MinimumDistances {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String [] args){
        int n = scanner.nextInt();
        int minDifference = Integer.MAX_VALUE;
        int [] array = new int[n];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++){
            array[i] = scanner.nextInt();
            if (map.containsKey(array[i])){
                int a = map.get(array[i]);
                int difference = i - a;
                if (difference < minDifference) {
                    minDifference = difference;
                }
            } else {
                map.put(array[i], i);
            }
        }
        if (minDifference == Integer.MAX_VALUE){
            minDifference = -1;
        }
        System.out.println(minDifference);
        scanner.close();
    }
}
