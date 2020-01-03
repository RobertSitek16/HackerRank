/*
In this problem, you are given N integers. You need to find the maximum number of unique integers among all the possible
contiguous subarrays of size M.
 */
package practice.java.dataStructures;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;

public class JavaDequeue {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        HashSet<Integer> hashSet = new HashSet<>();

        int n = in.nextInt();
        int m = in.nextInt();
        int max = 0;

        for (int i = 0; i < n; i++) {
            int input = in.nextInt();

            deque.add(input);
            hashSet.add(input);

            if (deque.size() == m) {
                if (hashSet.size() > max) max = hashSet.size();
                int first = deque.remove();
                if (!deque.contains(first)) hashSet.remove(first);
            }
        }
        System.out.println(max);
    }
}
