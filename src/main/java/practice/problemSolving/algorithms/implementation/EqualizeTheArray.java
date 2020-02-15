package practice.problemSolving.algorithms.implementation;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class EqualizeTheArray {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            if (map.containsKey(number)) {
                map.put(number, map.get(number) + 1);
            } else {
                map.put(number, 1);
            }
        }
        System.out.println(n - Collections.max(map.values()));
        scanner.close();
    }
}
