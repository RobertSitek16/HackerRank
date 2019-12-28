/*
The Utopian Tree goes through 2 cycles of growth every year. Each spring, it doubles in height. Each summer, its height
increases by 1 meter.

Laura plants a Utopian Tree sapling with a height of 1 meter at the onset of spring. How tall will her tree be after n
growth cycles?
 */
package practice.problemSolving.algorithms.implementation;

import java.util.Scanner;

public class UtopianTree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++){
            int n = scanner.nextInt();
            int height = 1;
            for (int j = 0; j < n; j++){
                if (j % 2 == 0){
                    height *= 2;
                } else {
                    height++;
                }
            }
            System.out.println(height);
        }
        scanner.close();
    }
}
