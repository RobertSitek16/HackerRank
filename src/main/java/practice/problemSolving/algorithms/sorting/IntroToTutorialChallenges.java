/*
This is a simple challenge to get things started. Given a sorted array (arr) and a number(v), can you print the index location
of v in the array?

For example, if arr = [1, 2, 3] and v = 3, you would print 2 for a zero-based index array.
 */
package practice.problemSolving.algorithms.sorting;

import java.util.Scanner;

public class IntroToTutorialChallenges {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String [] args){
        int v = scanner.nextInt();
        int [] arr = new int[scanner.nextInt()];

        for (int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }

        int result = introTutorial(v, arr);

        System.out.println(result);

        scanner.close();
    }

    private static int introTutorial(int v, int[] arr) {
        int i = 0;
        while (arr[i] != v){
            i++;
        }
        return i;
    }
}
