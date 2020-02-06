/*
Given two strings, determine if they share a common substring. A substring may be as small as one character.
For example, the words "a", "and", "art" share the common substring a. The words "be" and "cat" do not share a substring.
 */
package practice.interviewPreparationKit.dictionariesAndHashmaps;

import java.util.Scanner;

public class TwoStrings {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String [] args){
        int testCases = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = 0; i < testCases; i++){
            int result = 0;
            String s1 = scanner.nextLine();
            String s2 = scanner.nextLine();
            for(char ch = 'a'; ch <= 'z'; ch++){
                if(s2.indexOf(ch) > -1 && s1.indexOf(ch) > -1){
                   result++;
                }
            }
            if (result != 0){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
