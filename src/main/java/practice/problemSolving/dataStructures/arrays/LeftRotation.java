/*
A left rotation operation on an array of size n shifts each of the array's elements 1 unit to the left. For example, if 2 left
rotations are performed on array [1,2,3,4,5], then the array would become [3,4,5,1,2].

Given an array of n integers and a number, d, perform d left rotations on the array. Then print the updated array as a single
line of space-separated integers.
 */
package practice.problemSolving.dataStructures.arrays;

import java.util.Scanner;

public class LeftRotation {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int [] a = new int[scanner.nextInt()];
        int d = scanner.nextInt();
        for (int i = 0; i < a.length; i++){
            int rotation = (i + (a.length - d)) % a.length;
            a[rotation] = scanner.nextInt();
        }
        for (int result: a) {
            System.out.print(result + " ");
        }
    }
}
