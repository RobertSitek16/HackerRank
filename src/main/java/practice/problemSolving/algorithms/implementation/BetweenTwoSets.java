package practice.problemSolving.algorithms.implementation;

import java.util.*;

public class BetweenTwoSets {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String [] args){
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int [] a = new int[n];
        int [] b = new int[m];

        for (int i = 0; i < a.length; i++){
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);

        for (int i = 0; i < b.length; i++){
            b[i] = scanner.nextInt();
        }
        Arrays.sort(b);

        System.out.println(getTotal(a, b));

        scanner.close();

    }

    private static int getTotal(int [] a, int [] b){
        int min = a[0];
        int max = b[b.length - 1];
        int count = 0;

        for (int i = min; i <= max; i++){
            if (hasFactors(i, a) && isFactor(i, b)){
                count++;
            }
        }
        return count;
    }

    private static boolean hasFactors(int num, int [] array){
        for (int i = 0; i < array.length; i++){
            if (num % array[i] != 0){
                return false;
            }
        }
        return true;
    }

    private static boolean isFactor(int num, int [] array){
        for (int i = 0; i < array.length; i++){
            if (array[i] % num != 0){
                return false;
            }
        }
        return true;
    }
}
