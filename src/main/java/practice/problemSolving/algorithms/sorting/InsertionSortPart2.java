package practice.problemSolving.algorithms.sorting;

import java.util.Scanner;

public class InsertionSortPart2 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String [] args){

        int [] array = new int[scanner.nextInt()];

        for (int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }

        for (int i = 1; i < array.length; i++){
            int j = i;
            int value = array[i];
            while (j >= 1 && array[j-1] > value){
                array[j] = array[j - 1];
                j--;
            }
            array[j] = value;
            for (int s: array) {
                System.out.print(s + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
