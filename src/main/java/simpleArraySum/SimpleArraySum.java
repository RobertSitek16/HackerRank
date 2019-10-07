package simpleArraySum;

import java.util.Scanner;

public class SimpleArraySum {

    static int simpleArraySum(int [] ar){

        int mySum = 0;
        for (int i = 0; i <ar.length; i++){
            mySum += ar[i];
        }
        return mySum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        int arCount = Integer.parseInt(scanner.nextLine().trim());

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");

        for (int arItr = 0; arItr < arCount; arItr++) {
            int arItem = Integer.parseInt(arItems[arItr].trim());
            ar[arItr] = arItem;
        }

        System.out.println(simpleArraySum(ar));

    }
}
