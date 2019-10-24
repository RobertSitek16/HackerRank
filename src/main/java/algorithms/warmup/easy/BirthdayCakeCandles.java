package algorithms.warmup.easy;

import java.util.Scanner;

public class BirthdayCakeCandles {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        String n = scanner.nextLine();
        System.out.println("Enter the "+ n +"  numbers");
        String[] array = scanner.nextLine().split(" ");
        int size = Integer.parseInt(n);
        int [] candleHeights = new int[size];
        int sum = 0;
        for (int i = 0; i < size; i++){
            int items = Integer.parseInt(array[i]);
            candleHeights[i] = items;
        }
        int theHighest = candleHeights[0];
        for (int i = 0; i < size; i++){
            if (theHighest < candleHeights[i]){
                theHighest = candleHeights[i];
            }
        }
        for (int i = 0; i < size; i++){
            if (candleHeights[i] == theHighest){
                sum++;
            }
        }
        System.out.println("Sum of the highest number: " + sum);
        System.out.println("The highest number: " + theHighest);
    }
}
