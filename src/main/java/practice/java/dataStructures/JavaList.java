/*
For this problem, we have 2 types of queries you can perform on a List:
1. Insert y at index x:

Insert
x y

2. Delete the element at index x:

Delete
x

Given a list, L, of N integers, perform Q queries on the list. Once all queries are
completed, print the modified list as a single line of space-separated integers.
 */
package practice.java.dataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeList = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < sizeList; i++){
            list.add(scanner.nextInt());
        }
        int q = scanner.nextInt();
        String query;
        int x;
        int y;
        while (q > 0){
            switch (query = scanner.next()){
                case "Insert":
                    x = scanner.nextInt();
                    y = scanner.nextInt();
                    list.add(x, y);
                    break;
                case "Delete":
                    x = scanner.nextInt();
                    list.remove(x);
                    break;
            }
            q--;
        }
        for (Integer show: list) {
            System.out.print(show + " ");
        }
    }
}
