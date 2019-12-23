/*
You are choreographing a circus show with various animals. For one act, you are given two kangaroos on a number line
ready to jump in the positive direction (i.e, toward positive infinity).

* The first kangaroo starts at location x1 and moves at a rate of v1 meters per jump.
* The second kangaroo starts at location x2 and moves at a rate of v2 meters per jump.

You have to figure out a way to get both kangaroos at the same location at the same time as part of the show. If it is
possible, return YES, otherwise return NO.
 */
package practice.problemSolving.algorithms.implementation;

import java.util.Scanner;

public class Kangaroo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int v1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int v2 = scanner.nextInt();
        int x = x1 - x2;
        int v = v2 - v1;
        if (v != 0){
            if (x % v == 0 && x / v > 0){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else System.out.println("NO");
    }
}
