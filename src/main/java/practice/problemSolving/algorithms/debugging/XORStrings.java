/*
In this challenge, the task is to debug the existing code to successfully execute all provided test files.

Given two strings consisting of digits 0 and 1 only, find the XOR of the two strings.
Debug the given function strings_xor to find the XOR of the two given strings appropriately.
Note: You can modify at most three lines in the given code and you cannot add or remove lines to the code.
To restore the original code in the editor, create a new buffer by clicking on the top left icon in the editor.

Input Format
The input consists of two lines. The first line of the input contains the first string, s, and the second line contains the second
string, t.
 */
package practice.problemSolving.algorithms.debugging;

import java.util.Scanner;

public class XORStrings {

    private static String stringsXOR(String s, String t) {
        String res = new String("");
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == t.charAt(i))
                res += "0";
            else
                res += "1";
        }

        return res;
    }

    public static void main(String[] args) {

        String s, t;
        Scanner in = new Scanner(System.in);
        s = in.nextLine();
        t = in.nextLine();
        System.out.println(stringsXOR(s, t));

    }
}
