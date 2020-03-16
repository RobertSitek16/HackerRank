/*
Watson likes to challenge Sherlock's math ability. He will provide a starting and ending value describing a range of integers.
Sherlock must determine the number of square integers within that range, inclusive of the endpoints.

Note: A square integer is an integer which is the square of an integer, e.g. 1, 4, 9, 16, 25.

For example, the range is a = 24 and b = 49, inclusive. There are three square integers in the range: 25, 36 and 49.
 */
package practice.problemSolving.algorithms.implementation;

import java.util.Scanner;

public class SherlockAndSquares {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String [] args){

        int testCases = scanner.nextInt();

        for (int i = 0; i < testCases; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            int result = squares(a, b);

            System.out.println(result);
        }

        scanner.close();
    }

    private static int squares(int a, int b) {
        int numberOfSquares = 0;
        int x = 1;
        while (x * x < a){
            x++;
        }
        while (x * x <= b){
            numberOfSquares++;
            x++;
        }
        return numberOfSquares;
    }
}
