/*
Lilah has a string, s, of lowercase English letters that she repeated infinitely many times.
Given an integer, n, find and print the number of letter a's in the first n letters of Lilah's infinite string.
For example, if the string s ='abcac' and n=10, the substring we consider is abcacabcac, the first
10 characters of her infinite string. There are 4 occurrences of a in the substring.
 */
package practice.interviewPreparationKit.warmUpChallenges;

import java.util.Scanner;

public class RepeatedString {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String [] args){
        String s = scanner.nextLine();
        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        long result = repeatedString(s, n);
        System.out.println(result);
        scanner.close();
    }

    static long repeatedString(String s, long n) {
        char [] chars = s.toCharArray();
        int numbersOfOccurrencesA = 0;

        for (int i = 0; i < chars.length; i++){
            if (chars[i] == 'a'){
                numbersOfOccurrencesA++;
            }
        }

        long result = 0l;

        if (s.equals("a")){
            return n;
        } else {
            result = result + (n / s.length() * numbersOfOccurrencesA);
            for (int i = 0; i < (n % s.length()); i++) {
                if (s.charAt(i) == 'a') {
                    result++;
                }
            }
        }
        return result;
    }
}
