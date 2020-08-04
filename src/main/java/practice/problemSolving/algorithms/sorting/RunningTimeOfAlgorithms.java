package practice.problemSolving.algorithms.sorting;

import java.util.Scanner;

public class RunningTimeOfAlgorithms {

    private static int runningTime(int[] arr) {
        int k = 0;
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    k++;
                }
            }
        }
        return k;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int [] arr = new int [n];

        for(int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }

        int result = runningTime(arr);
        System.out.println(result);

        scanner.close();
    }
}
