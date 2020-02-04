package practice.problemSolving.algorithms.implementation;

import java.util.Scanner;

public class ViralAdvertising {

    static int viralAdvertising(int n) {
        int cumulative = 0;
        int recipients = 5;
        for (int i = 0; i < n; i++){
            int likes = recipients/2;
            recipients = likes * 3;
            cumulative = cumulative + likes;
        }
        return cumulative;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        int n = scanner.nextInt();
        int result = viralAdvertising(n);
        System.out.println(result);
        scanner.close();
    }
}
