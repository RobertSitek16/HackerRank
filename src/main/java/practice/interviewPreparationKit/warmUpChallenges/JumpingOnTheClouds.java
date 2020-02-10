package practice.interviewPreparationKit.warmUpChallenges;

import java.util.Scanner;

public class JumpingOnTheClouds {

    static int jumpingOnClouds(int[] clouds) {
        int jumps = -1;
        for (int i = 0; i < clouds.length; i++, jumps++){
            if (i < clouds.length - 2 && clouds[i+2] == 0){
                i++;
            }
        }
        return jumps;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();

        int[] clouds = new int[n];

        for (int i = 0; i < n; i++) {
            clouds[i] = scanner.nextInt();
        }

        int result = jumpingOnClouds(clouds);
        System.out.println(result);

        scanner.close();
    }
}
