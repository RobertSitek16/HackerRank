package medium;

import java.util.Arrays;
import java.util.Scanner;

public class Pairs {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array and space-separated target value");
        String [] sizeAndValueAsString = input.nextLine().split(" ");

        int size = Integer.parseInt(sizeAndValueAsString[0]);
        int value = Integer.parseInt(sizeAndValueAsString[1]);

        System.out.println("Enter the "+ size +" numbers");
        String [] numbersAsString = input.nextLine().split(" ");
        int [] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++){
            int items = Integer.parseInt(numbersAsString[i]);
            numbers[i] = items;
        }
        int counter = 0;
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++){
            for (int j = i + 1; j < numbers.length; j++){
                if (numbers[j] - numbers[i] == value || numbers[i] - numbers[j] == value){
                    counter++;
                } else if (numbers[j] - numbers[i] > value || numbers[i] - numbers[j] > value){
                    break;
                }
            }
        }
        System.out.println("The number of pairs in array whose difference is equal to "+ value + " is " + counter);
    }
}
