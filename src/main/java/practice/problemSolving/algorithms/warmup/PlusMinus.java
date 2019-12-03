package practice.problemSolving.algorithms.warmup;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class PlusMinus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = scanner.nextInt();
        int[] values = new int[n];
        double positive = 0;
        double negative = 0;
        double zeros = 0;
        System.out.println("Enter " + n + " values");
        for (int i = 0; i < values.length; i++){
            values[i] = scanner.nextInt();
            if (values[i] > 0){
                positive++;
            } else if (values[i] < 0){
                negative++;
            } else {
                zeros++;
            }
        }
        BigDecimal positiveResult = BigDecimal.valueOf((positive/n)).setScale(6, RoundingMode.HALF_UP);
        BigDecimal negativeResult = BigDecimal.valueOf((negative/n)).setScale(6, RoundingMode.HALF_UP);
        BigDecimal zerosResult = BigDecimal.valueOf((zeros/n)).setScale(6, RoundingMode.HALF_UP);
        System.out.println("Ratio of positive numbers to the size of the table: " + positiveResult);
        System.out.println("Ratio of negative numbers to the size of the table: " + negativeResult);
        System.out.println("Ratio of zeros numbers to the size of the table: " + zerosResult);
    }
}
