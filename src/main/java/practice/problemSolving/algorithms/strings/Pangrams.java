/*
Function Description
Complete the function pangrams in the editor below. It should return the string pangram if the input string is a pangram.
Otherwise, it should return not pangram.
 */
package practice.problemSolving.algorithms.strings;

import java.util.Arrays;
import java.util.Scanner;

public class Pangrams {

    private static final Scanner scanner = new Scanner(System.in);

    private static String pangrams(String s){
        char [] stringInArray = s.trim().toLowerCase().toCharArray();
        Arrays.sort(stringInArray);
        String alphabet = "abcdefghijklmnoprstuvwxyz";
        char [] alphabetInArray = alphabet.toCharArray();
        int k = 0;
        for (int i = 0; i < stringInArray.length; i++){
            if (stringInArray[i] == alphabetInArray[k]){
                k++;
            }
            if (k == alphabetInArray.length){
                return "pangram";
            }
        }
        return "not pangram";
    }

    public static void main(String[] args){
        String input = scanner.nextLine();
        String result = pangrams(input);
        System.out.println(result);
        scanner.close();
    }
}
