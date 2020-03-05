/*
Complete the angryProfessor function in the editor below. It must return YES if class is cancelled, or NO otherwise.
angryProfessor has the following parameter(s):
- k: the threshold number of students
- a: an array of integers representing arrival times
 */
package practice.problemSolving.algorithms.implementation;

import java.util.Arrays;
import java.util.Scanner;

public class AngryProfessor {

    static String angryProfessor(int k, int[] a) {
        Arrays.sort(a);
        int numberOfStudentsOnTime = 0;
        for (int i = 0; i < a.length; i++){
            if (a[i] <= 0){
                numberOfStudentsOnTime++;
            }
        }
        if (numberOfStudentsOnTime >= k){
            return "NO";
        } else {
            return "YES";
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {

            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int [] a = new int[n];

            for (int j = 0; j < n; j++){
                a[j] = scanner.nextInt();
            }

            String result = angryProfessor(k, a);
            System.out.println(result);
        }
        scanner.close();
    }
}
