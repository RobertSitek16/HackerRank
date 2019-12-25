/*
Anna and Brian are sharing a meal at a restuarant and they agree to split the bill equally. Brian wants to order something that
Anna is allergic to though, and they agree that Anna won't pay for that item. Brian gets the check and calculates Anna's portion.
You must determine if his calculation is correct.

Complete the  function in the editor below. It should print Bon Appetit if the bill is fairly split. Otherwise, it should
print the integer amount of money that Brian owes Anna.

Input Format

The first line contains two space-separated integers n and k, the number of items ordered and the 0-based index of the item
that Anna did not eat.
The second line contains n space-separated integers bill[i] where 0 <= i <n.
The third line contains an integer, b, the amount of money that Brian charged Anna for her share of the bill.
 */
package practice.problemSolving.algorithms.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BonAppetit {

    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        List<Integer> bill = new ArrayList<>();
        for (int i = 0; i < n; i++){
            bill.add(scanner.nextInt());
        }
        int b = scanner.nextInt();
        int sum = bill.stream().mapToInt(Integer::intValue).sum();
        if (b == (sum - bill.get(k))/2){
            System.out.println("Bon Appetit");
        } else {
            System.out.println(b - ((sum - bill.get(k))/2));
        }
    }
}
