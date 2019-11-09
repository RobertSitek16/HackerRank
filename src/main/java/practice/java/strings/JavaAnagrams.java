/*
Two strings, a and b, are called anagrams if they contain all the same characters
in the same frequencies. For example, the anagrams of CAT are CAT, ACT, TAC, TCA, ATC and
CTA.
Complete the function in the editor. If a and b are case-insensitive anagrams, print
"Anagrams"; otherwise print "Not Anagrams" instead.
 */

package practice.java.strings;

import java.util.Scanner;

public class JavaAnagrams {

    static boolean isAnagram(String a, String b) {
        String bigA = a.toLowerCase();
        String bigB = b.toLowerCase();
        String[] wordsFromA = new String[bigA.length()];
        String[] wordsFromB = new String[bigB.length()];
        for (int i = 0; i < bigA.length(); i++) {
            String singleLettersA = bigA.substring(i, i + 1);
            wordsFromA[i] = singleLettersA;
        }

        for (int i = 0; i < wordsFromA.length - 1; i++) {
            for (int j = i + 1; j < wordsFromA.length; j++) {
                if (wordsFromA[i].compareTo(wordsFromA[j]) > 0) {
                    String sortMyWords = wordsFromA[i];
                    wordsFromA[i] = wordsFromA[j];
                    wordsFromA[j] = sortMyWords;
                }
            }
        }

        for (int i = 0; i < bigB.length(); i++) {
            String singleLettersB = bigB.substring(i, i + 1);
            wordsFromB[i] = singleLettersB;
        }

        for (int i = 0; i < wordsFromB.length - 1; i++) {
            for (int j = i + 1; j < wordsFromB.length; j++) {
                if (wordsFromB[i].compareTo(wordsFromB[j]) > 0) {
                    String sortMyWords = wordsFromB[i];
                    wordsFromB[i] = wordsFromB[j];
                    wordsFromB[j] = sortMyWords;
                }
            }
        }
        if (wordsFromA.length != wordsFromB.length) {
            return false;
        }

        for (int i = 0; i < wordsFromA.length; i++) {
            if (!wordsFromA[i].equals(wordsFromB[i])) {
                return false;
            }
        }
        return true;
    }

        public static void main (String[]args){
            Scanner scan = new Scanner(System.in);
            String a = scan.next();
            String b = scan.next();
            scan.close();
            boolean ret = isAnagram(a, b);
            System.out.println((ret) ? "Anagrams" : "Not Anagrams");
        }
    }
