/*
Given an array of n integers, find and print its number of negative subarrays on a new line.
 */
package practice.java.dataStructures;

import java.util.Scanner;

public class Subarray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sizeArray = scanner.nextInt();

        int [] array = new int[sizeArray];

        int findNegative = 0;

        for (int i = 0; i < sizeArray; i++){
            array[i] = scanner.nextInt();
        }

        for (int j = 0; j < sizeArray; j++){
            int sum = 0;
            for (int k = j; k < sizeArray; k++){
                sum += array[k];
                if (sum < 0){
                    findNegative++;
                }
            }
        }
        System.out.println(findNegative);
    }
}
