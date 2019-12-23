/*
Sam's house has an apple tree and an orange tree that yield an abundance of fruit. In the diagram below, the red region
denotes his house, where s is the start point, and t is the endpoint. The apple tree is to the left of his house, and the orange
tree is to its right. You can assume the trees are located on a single point, where the apple tree is at point a, and the orange
tree is at point b.

When a fruit falls from its tree, it lands d units of distance from its tree of origin along the x-axis. A negative value of d
means the fruit fell d units to the tree's left, and a positive value of d means it falls d units to the tree's right.

Given the value of d for m apples and n oranges, determine how many apples and oranges will fall on Sam's house (i.e., in
the inclusive range [s,t])?
 */
package practice.problemSolving.algorithms.implementation;

import java.util.Scanner;

public class AppleAndOrange {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int t = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int [] applesArray = new int[m];
        int appleCounter = 0;
        for (int i = 0; i < m; i++){
            applesArray[i] = scanner.nextInt() + a;
            if (applesArray[i] >= s && applesArray[i] <= t){
                appleCounter++;
            }
        }

        int [] orangesArray = new int[n];
        int orangeCounter = 0;
        for (int i = 0; i < n; i++){
            orangesArray[i] = scanner.nextInt() + b;
            if (orangesArray[i] >= s && orangesArray[i] <= t){
                orangeCounter++;
            }
        }
        System.out.println(appleCounter);
        System.out.println(orangeCounter);
    }
}
