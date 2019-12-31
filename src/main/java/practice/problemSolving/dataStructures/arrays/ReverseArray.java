package practice.problemSolving.dataStructures.arrays;

import java.util.*;

public class ReverseArray {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++){
            arr.add(scanner.nextInt());
        }
        Collections.reverse(arr);
        for (int s: arr) {
            System.out.print(s + " ");
        }
    }
}
