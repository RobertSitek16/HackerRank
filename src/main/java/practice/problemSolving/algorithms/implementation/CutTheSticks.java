package practice.problemSolving.algorithms.implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class CutTheSticks {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int sticks [] = new int[n];
        for (int i = 0; i < n; i++) {
            sticks[i] = scanner.nextInt();
        }
        Arrays.sort(sticks);
        int minimumValue = sticks[0];
        for (int i = 0; i < n;) {
            System.out.println(sticks.length-i);
            i++;
            if (i == n){
                break;
            }
            while (sticks[i] ==(minimumValue)){
                i++;
            }
            minimumValue = sticks[i];
        }
    }
}
