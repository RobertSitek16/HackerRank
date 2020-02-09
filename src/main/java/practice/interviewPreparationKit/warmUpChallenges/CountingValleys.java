package practice.interviewPreparationKit.warmUpChallenges;

import java.util.Scanner;

public class CountingValleys {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String s = scanner.nextLine();
        char [] chars = s.toCharArray();
        int result = 0;
        int seaLevel = 0;
        for (int i = 0; i < n; i++) {
            if (chars[i] == 'D') {
                seaLevel--;
            } else {
                seaLevel++;
            }
            if (seaLevel < 0) {
                if (chars[i] == 'U') {
                    seaLevel++;
                } else {
                    seaLevel--;
                }
                if (seaLevel >= 0) {
                    result++;
                }
            }
        }
        System.out.println(result);
        scanner.close();
    }
}
