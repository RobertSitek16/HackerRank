package practice.interviewPreparationKit.search;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IceCreamParlor {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++){
            int money = scanner.nextInt();
            int n = scanner.nextInt();
            int[] cost = new int[n];

            for (int j = 0; j < n; j++){
                cost[j] = scanner.nextInt();
            }

            whatFlavors(cost, money);
        }
        scanner.close();
    }

    static void whatFlavors(int[] cost, int money) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(money-cost[0],1);
        for(int i=1; i<cost.length; i++) {
            if(map.containsKey(cost[i])) {
                System.out.println(map.get(cost[i])+" "+(i+1));
                break;
            }
            else if(!map.containsKey(cost[i])&&money-cost[i]>0) {
                map.put(money-cost[i], i+1);
            }
        }
    }
}
