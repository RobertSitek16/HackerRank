package practice.problemSolving.algorithms.implementation;

import java.util.Scanner;

public class Revisited {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int [] clouds = new int[n];
        for (int i = 0; i < n; i++){
            clouds[i] = scanner.nextInt();
        }
        int energy = 100;
        for (int i = k; i <= n;){
            if (k == n){
                i = 0;
                if (clouds[i] == 1){
                    energy = energy - 1 - 2;
                } else{
                    energy = energy - 1;
                }
                break;
            }
            if (clouds[i] == 1){
                energy = energy - 1 - 2;
            } else{
                energy = energy - 1;
            }
            i = i + k;
            if (i >= n){
                i = i - n;
                if (i == 0){
                    if (clouds[i] == 1){
                        energy = energy - 1 - 2;
                    } else{
                        energy = energy - 1;
                    }
                    break;
                }
            }
        }
        System.out.println(energy);
        scanner.close();
    }
}
