package practice.problemSolving.algorithms.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LuckBalance {

    static int luckValue(int k, int all, List<Integer> important){
        Collections.sort(important);
        int irrelevant = 0;
        int highestWin = important.size() - k;
        for (int i = 0; i < highestWin; i++){
            irrelevant += important.get(i);
        }
        int result = all - 2*irrelevant;
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String [] args){
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int all = 0;
        List<Integer> important = new ArrayList<>();
        for (int i = 0; i < n; i++){
            int luckValue = scanner.nextInt();
            int importanceValue = scanner.nextInt();
            all += luckValue;
            if (importanceValue == 1){
                important.add(luckValue);
            }
        }
        int result = luckValue(k, all, important);
        System.out.println(result);
    }
}
