package practice.problemSolving.algorithms.greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MarcCakewalk {

    public static long marcsCakewalk(Integer [] calorie){

        long miles = 0;

        Arrays.sort(calorie, Collections.reverseOrder());

        for (int i = 0; i < calorie.length; i++){
            miles += Math.pow(2, i) * calorie[i];
        }

        return miles;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String [] args){

        int n = scanner.nextInt();

        Integer [] calorie = new Integer[n];

        for (int i = 0; i < n; i++){
            calorie[i] = scanner.nextInt();
        }

        long result = marcsCakewalk(calorie);
        System.out.println(result);

        scanner.close();
    }
}
