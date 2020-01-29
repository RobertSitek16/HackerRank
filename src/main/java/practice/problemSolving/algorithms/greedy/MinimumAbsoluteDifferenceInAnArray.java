package practice.problemSolving.algorithms.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumAbsoluteDifferenceInAnArray {

    static int minimumAbsoulteDifference(int [] numbers){

        Arrays.sort(numbers);

        int minimum = Math.abs(numbers[0] - numbers[1]);

        for (int i = 1; i < numbers.length - 1; i++){
            if (Math.abs(numbers[i] - numbers[i+1]) < minimum){
                minimum = Math.abs(numbers[i] - numbers[i+1]);
            }
        }
        return minimum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String [] args){
        int [] numbers = new int[scanner.nextInt()];

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = scanner.nextInt();
        }

        int result = minimumAbsoulteDifference(numbers);
        System.out.println(result);

        scanner.close();
    }
}
