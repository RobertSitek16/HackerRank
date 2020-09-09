package practice.problemSolving.algorithms.search;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IceCreamParlor {
    private static int[] icecreamParlor(int m, int[] cost) {
        int result[] = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < cost.length; i++) {
            int x = cost[i];
            int y = m - x;
            Integer a = map.get(y);
            if (a != null) {
                result[0] = a + 1;
                result[1] = i + 1;
            }
            map.put(x, i);
        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {

            int m = scanner.nextInt();
            int n = scanner.nextInt();
            int[] arr = new int[n];

            for (int j = 0; j < n; j++) {
                arr[j] = scanner.nextInt();
            }

            int[] result = icecreamParlor(m, arr);

            for (int show : result) {
                System.out.print(show + " ");
            }

            System.out.println();

        }

        scanner.close();
    }
}
