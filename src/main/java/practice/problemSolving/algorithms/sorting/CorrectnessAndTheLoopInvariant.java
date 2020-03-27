package practice.problemSolving.algorithms.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class CorrectnessAndTheLoopInvariant {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String [] args){
        int s = scanner.nextInt();
        int [] arr = new int [s];
        for(int i = 0; i < s; i++){
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        for (int show: arr) {
            System.out.print(show + " ");
        }
        scanner.close();
    }
}
