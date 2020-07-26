/*
Monica wants to buy a keyboard and a USB drive from her favorite electronics store.
The store has several models of each. Monica wants to spend as much as possible for the 2 items, given her budget.

Given the price lists for the store's keyboards and USB drives, and Monica's budget, find and print the amount of money Monica
will spend. If she doesn't have enough money to both a keyboard and a USB drive, print -1 instead. She will buy only the two
required items.
 */
package practice.problemSolving.algorithms.implementation;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ElectronicsShop {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int b = scanner.nextInt();

        int numberOfKeybord = scanner.nextInt();

        int numberOfUsb = scanner.nextInt();

        Integer[] keyboards = new Integer[numberOfKeybord];

        for (int i = 0; i < numberOfKeybord; i++) {
            int keyboardsItem = scanner.nextInt();
            keyboards[i] = keyboardsItem;
        }

        int[] drives = new int[numberOfUsb];

        for (int i = 0; i < numberOfUsb; i++){
            int driversItem = scanner.nextInt();
            drives[i] = driversItem;
        }

        Arrays.sort(keyboards, Collections.reverseOrder());
        Arrays.sort(drives);

        int max = -1;

        for(int i = 0, j = 0; i < numberOfKeybord; i++){
            for(; j < numberOfUsb; j++){
                if(keyboards[i] + drives[j] > b){
                    break;
                }
                if(keyboards[i] + drives[j] > max){
                    max = keyboards[i] + drives[j];
                }
            }
        }
        System.out.println(max);

        scanner.close();
    }
}
