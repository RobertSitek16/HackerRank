/*
You are given n lines. In each line there are zero or more integers. You need to answer a few queries
where you need to tell the number located in y position of x line.
Take your input from System.in.

Input Format
The first line has an integer n. In each of the next n lines there will be an integer d denoting number
of integers on that line and then there will be d space-separated integers. In the next line there will be
an integer q denoting number of queries. Each query will consist of two integers x and y.
 */
package practice.java.dataStructures;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaArraylist {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d,q,x,y;
        ArrayList [] arrayList = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            d = scanner.nextInt();
            arrayList[i] = new ArrayList();
            for (int j = 0; j < d; j++) {
                arrayList[i].add(scanner.nextInt());
            }
        }
        q = scanner.nextInt();
        for (int i = 0; i < q; i++){
            x = scanner.nextInt();
            y = scanner.nextInt();
            try {
                System.out.println(arrayList[x-1].get(y-1));
            } catch (Exception e){
                System.out.println("ERROR!");
            }
        }
    }
}
