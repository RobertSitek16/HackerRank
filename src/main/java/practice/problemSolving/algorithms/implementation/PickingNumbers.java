package practice.problemSolving.algorithms.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PickingNumbers {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int sizeOfList = scanner.nextInt();

        List<Integer> listOfNumbers = new ArrayList<>();

        for (int i = 0; i < sizeOfList; i++){
            listOfNumbers.add(scanner.nextInt());
        }

        int fq [] = new int[101];
        int result = Integer.MIN_VALUE;

        for(int i = 0; i < listOfNumbers.size(); i++){
            int index = listOfNumbers.get(i);
            fq[index]++;
        }

        for(int i = 1; i <= 100; i++){
            result = Math.max(result, fq[i] + fq[i -1]);
        }

        System.out.println(result);

    }
}
