/*
Given a string s, and an integer k, complete the function so that it finds the lexicographically smallest
and largest substrings of length k.
 */

package practice.java.strings;

import java.util.Scanner;

public class JavaSubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String sWithLengthK;
        String [] words = new String[s.length() - k + 1];
        for (int i = 0; i < s.length(); i++) {
            if (k + i <= s.length()) {
                sWithLengthK = s.substring(i, k + i);
                words[i] = sWithLengthK;
            } else {
                break;
            }
        }
        for (int i = 0; i < words.length - 1; i++){
            for (int j = i + 1; j < words.length; j++){
                if (words[i].compareTo(words[j]) > 0){
                    String sortMyWords = words[i];
                    words[i] = words[j];
                    words[j] = sortMyWords;
                }
            }
        }
        String smallest = words[0];
        String largest = words[s.length() - k];

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
