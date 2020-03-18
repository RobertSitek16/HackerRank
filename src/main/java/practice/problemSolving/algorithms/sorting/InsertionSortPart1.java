package practice.problemSolving.algorithms.sorting;

import java.util.Scanner;

public class InsertionSortPart1 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String [] args){
        int [] array = new int[scanner.nextInt()];

        for (int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }

        insertionSort1(array);

        scanner.close();
    }

    private static void insertionSort1(int[] array) {
        int i = array.length - 1;
        int numberAtBadPosition = array[i];
        while (i != 0){
            if (array[i - 1] > numberAtBadPosition){
                array[i] = array[i - 1];
            } else {
                array[i] = numberAtBadPosition;
                for (int show: array) {
                    System.out.print(show + " ");
                }
                break;
            }
            for (int show: array) {
                System.out.print(show + " ");
            }
            System.out.println();
            i--;
            if (i == 0){
                if (array[0] > numberAtBadPosition){
                    array[0] = numberAtBadPosition;
                    for (int show: array) {
                        System.out.print(show + " ");
                    }
                }
            }
        }
    }
}
