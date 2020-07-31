/*
Choose some pivot element, p, and partition your unsorted array, numbers, into three smaller arrays: left, right, and equal,
where each element in left < p, each element in right > p, and each element in equal = p.
 */
package practice.problemSolving.algorithms.sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quicksort1 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        int [] numbers = new int[scanner.nextInt()];
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = scanner.nextInt();
            int p = numbers[0];
            if (numbers[i] < p){
                left.add(numbers[i]);
            } else if (numbers[i] > p){
                right.add(numbers[i]);
            } else {
                equal.add(numbers[i]);
            }
        }
        for (int s: left) {
            System.out.print(s + " ");
        }
        for (int s: equal) {
            System.out.print(s+ " ");
        }
        for (int s: right) {
            System.out.print(s + " ");
        }
        scanner.close();
    }
}
