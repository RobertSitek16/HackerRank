/*
You are given a string containing characters A and B only. Your task is to change it into a string such
that there are no matching adjacent characters. To do this, you are allowed to delete zero or more
characters in the string.

Your task is to find the minimum number of required deletions.
 */
package practice.problemSolving.algorithms.strings;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AlternatingCharacters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++){
            int count = 0;
            String input = scanner.next();
            String [] inputAsChar = input.split("");
            List<String> list = Arrays.asList(inputAsChar);
            for (int j = 0; j < list.size()-1; j++){
                if (list.get(j).equals(list.get(j+1))){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
