/*
We say that a string contains the word hackerrank if a subsequence of its characters spell the word hackerrank. For
example, if string s = haacckkerrannkk it does contain hackerrank, but s = haacckkerannk does not. In the second
case, the second r is missing. If we reorder the first string as hccaakkerrannkk, it no longer contains the subsequence
due to ordering.
 */
package practice.problemSolving.algorithms.strings;

import java.util.Scanner;

public class HackerRankInAString {

    private static final Scanner scanner = new Scanner(System.in);

    static String hackerrankInString(String s){
        char expectedChar[] = {'h','a','c','k','e','r','r','a','n','k'};
        char actualChar[] = s.toCharArray();
        int k = 0;
        for (int i = 0; i < s.length(); i++){
            if (actualChar[i] == expectedChar[k]){
                k++;
            }
            if (k == 10){
                return "YES";
            }
        }
        return "NO";
    }

    public static void main(String[] args){

        int numberOfQueries = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < numberOfQueries; i++){
            String s = scanner.nextLine();
            String result = hackerrankInString(s);
            System.out.println(result);
        }

        scanner.close();
    }
}
