package practice.problemSolving.algorithms.warmup;

import java.util.Scanner;

public class CompareTheTriples {

    public static final int lengt = 3;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] listA = new int[lengt];
        int [] listB = new int[lengt];

        System.out.println("Provide 3 numbers for first list");
        for (int i = 0; i < lengt; i++){
            listA[i] = in.nextInt();
        }

        System.out.println("Provide 3 numbers for second list");
        for (int i = 0; i < lengt; i++){
            listB[i] = in.nextInt();
        }

        int aPoint = 0;
        int bPoint = 0;

        for (int i = 0; i < lengt; i++){
            if (listA[i] > listB[i]){
                aPoint++;
            } else if (listB[i] > listA[i]){
                bPoint++;
            }
        }
        System.out.println("Result:");
        System.out.println(aPoint + " " + bPoint);
    }
}


