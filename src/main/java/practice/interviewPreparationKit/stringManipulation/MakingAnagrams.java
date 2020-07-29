/*
Alice is taking a cryptography class and finding anagrams to be very useful. We consider two strings to be anagrams of each
other if the first string's letters can be rearranged to form the second string. In other words, both strings must contain
the same exact letters in the same exact frequency For example, bacdc and dcbac are anagrams, but bacdc and dcbad are not.

Alice decides on an encryption scheme involving two large strings where encryption is dependent on the minimum number of
character deletions required to make the two strings anagrams. Can you help her find this number?
 */
package practice.interviewPreparationKit.stringManipulation;

import java.util.Scanner;

public class MakingAnagrams {

    public static int makeAnagram(String first, String second) {
        String firstCopy = first;

        for (char c: first.toCharArray()){
            if (second.indexOf(c) != -1){
                firstCopy = firstCopy.replaceFirst(c + "", "");
                second = second.replaceFirst(c + "", "");
            }
        }

        return firstCopy.length() + second.length();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String first = scanner.nextLine();

        String second = scanner.nextLine();

        System.out.println(makeAnagram(first, second));

        scanner.close();
    }
}
