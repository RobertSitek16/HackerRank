/*
In this challenge, the task is to debug the existing code to successfully execute all provided test files.

A number is called a smart number if it has an odd number of factors. Given some numbers, find whether they are smart
numbers or not.
Debug the given function is_smart_number to correctly check if a given number is a smart number.
Note: You can modify only one line in the given code and you cannot add or remove any new lines.
To restore the original code in the editor, create a new buffer by clicking on the top left icon in the editor.
 */
package practice.problemSolving.algorithms.debugging;

import java.util.Scanner;

public class SmartNumber {
    private static boolean isSmartNumber(int num) {
        int val = (int) Math.sqrt(num);
        if((double)num / val == val)
            return true;
        return false;
    }

    public static void main(String[] args) {
        int test_cases;
        Scanner in = new Scanner(System.in);
        test_cases = in.nextInt();
        int num;
        for(int i = 0; i < test_cases; i++){
            num = in.nextInt();
            boolean ans = isSmartNumber(num);
            if(ans){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
