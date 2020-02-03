/*
Given a range of numbered days, [i...j] and a number k, determine the number of days in the range that are beautiful.
Beautiful numbers are defined as numbers where |i - reverse(i)| is evenly divisible by k. If a day's value is beautiful
number, it is a beautiful day. Print the number of beautiful days in the range.
 */
package practice.problemSolving.algorithms.implementation;

import java.util.Scanner;

public class BeautifulDaysAtTheMovies {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String [] args){
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        int k = scanner.nextInt();
        int beautifulDays = 0;
        while (i <= j){
            int reverseI = Integer.parseInt(new StringBuffer(String.valueOf(i)).reverse().toString());
            if (Math.abs(i - reverseI) % k == 0){
                beautifulDays++;
            }
            i++;
        }
        System.out.println(beautifulDays);
        scanner.close();
    }
}
