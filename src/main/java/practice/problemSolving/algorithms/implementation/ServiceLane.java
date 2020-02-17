/*
Calvin is driving his favorite vehicle on the 101 freeway. He notices that the check engine light of his vehicle is on, and he wants
to service it immediately to avoid any risks. Luckily, a service lane runs parallel to the highway. The service lane varies in width
along its length.

You will be given an array of widths at points along the road (indices), then a list of the indices of entry and exit points.
Considering each entry and exit point pair, calculate the maximum size vehicle that can travel that segment of the service lane
safely.
 */
package practice.problemSolving.algorithms.implementation;

import java.util.Scanner;

public class ServiceLane {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int t = scanner.nextInt();

        int [] width = new int[n];

        for (int index = 0; index < n; index++){
            width[index] = scanner.nextInt();
        }

        for (int index = 0; index < t; index++){
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            int minimumWidth = width[i];
            for (int start = i; start <= j; start++){
                if (minimumWidth > width[start]){
                    minimumWidth = width[start];
                }
            }
            System.out.println(minimumWidth);
        }
    }
}
