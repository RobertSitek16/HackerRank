package practice.problemSolving.algorithms.warmup;

import java.util.Scanner;

public class MiniMaxSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbers = new int[5];
        String [] arr = scanner.nextLine().split(" ");
        int sumAllNumbers = 0;

        for (int i = 0; i < numbers.length; i++){
            int item = Integer.parseInt(arr[i]);
            numbers[i] = item;
            sumAllNumbers = sumAllNumbers + numbers[i];
        }

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++){
            if (min > numbers[i]){
                min = numbers[i];
            }
            if (max < numbers[i]){
                max = numbers[i];
            }
        }

        System.out.println("Array: ");
        for (int showMeArray: numbers) {
            System.out.print(showMeArray + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);
        System.out.println("Sum all numbers except maximum number: " + (sumAllNumbers - max));
        System.out.println("Sum all numbers except minimum number: " + (sumAllNumbers - min));
    }
}
