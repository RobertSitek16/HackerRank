/*
You have been asked to help study the population of birds migrating across the continent. Each type of bird you are
interested in will be identified by an integer value. Each time a particular kind of bird is spotted, its id number will be added
to your array of sightings. You would like to be able to find out which type of bird is most common given a list of sightings.
Your task is to print the type number of that bird and if two or more types of birds are equally common, choose the type
with the smallest ID number.
 */
package practice.problemSolving.algorithms.implementation;

import java.util.*;

public class MigratoryBirds {

    static int migratoryBirds(int n, int[] ar) {
        int[] ary = new int[n];
        for (int i = 0; i < n; i++){
            ary[ar[i]]++;
        }
        int max = 0;
        int maxPos = 0;
        for (int i = 0; i < n; i++) {
            if (ary[i] > max) {
                max = ary[i];
                maxPos = i;
            }
        }
        return maxPos;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int result = migratoryBirds(n, arr);

        System.out.println(result);
    }
}

