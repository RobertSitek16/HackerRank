/*
Given two dates each in the format dd-mm-yyyy, you have to find the number of lucky dates between them (inclusive). To
see if a date is lucky,
- Firstly, sequentially concatinate the date, month and year, into a new integer x erasing the leading zeroes.
- Now if x is divisible by either 4 or 7, then we call the date a lucky date.
For example, let's take the date "02-08-2024". After concatinating the day, month and year, we get x = 2082024. As x is
divisible by 4 so the date "02-08-2024" is called a lucky date.
 */
package practice.problemSolving.algorithms.debugging;

import java.util.Scanner;
import java.util.StringTokenizer;

public class PrimeDates {
    public static int month[];

    public static void main (String[] args) throws java.lang.Exception {
        Scanner in  = new Scanner(System.in);

        month = new int[15];

        String s = in.nextLine();

        StringTokenizer str = new StringTokenizer(s, "- ");

        int d1 = Integer.parseInt(str.nextToken());
        int m1 = Integer.parseInt(str.nextToken());
        int y1 = Integer.parseInt(str.nextToken());
        int d2 = Integer.parseInt(str.nextToken());
        int m2 = Integer.parseInt(str.nextToken());
        int y2 = Integer.parseInt(str.nextToken());

        int result = findPrimeDates(d1, m1, y1, d2, m2, y2);
        System.out.println(result);
    }

    public static void updateLeapYear(int year) {
        if(year % 400 == 0) {
            month[2] = 29; //first change
        } else if(year % 100 == 0) {
            month[2] = 28; //second change
        } else if(year % 4 == 0) {
            month[2] = 29;
        } else {
            month[2] = 28;
        }
    }

    public static void storeMonth() {
        month[1] = 31;
        month[2] = 28;
        month[3] = 31;
        month[4] = 30;
        month[5] = 31;
        month[6] = 30;
        month[7] = 31;
        month[8] = 31;
        month[9] = 30;
        month[10] = 31;
        month[11] = 30;
        month[12] = 31;
    }

    public static int findPrimeDates(int d1, int m1, int y1, int d2, int m2, int y2) {
        storeMonth();

        int result = 0;

        while(true) {
            int x = d1;
            x = x * 100 + m1;
            x = x * 10000 + y1; //third change
            if(x % 4 == 0 || x % 7 == 0) { //fourth change
                result = result + 1;
            }
            if(d1 == d2 && m1 == m2 && y1 == y2) {
                break;
            }
            updateLeapYear(y1);
            d1 = d1 + 1;
            if(d1 > month[m1]) {
                m1 = m1 + 1;
                d1 = 1;
                if(m1 > 12) {
                    y1 =  y1 + 1;
                    m1 = 1; //fifth change
                }
            }
        }
        return result;
    }
}
