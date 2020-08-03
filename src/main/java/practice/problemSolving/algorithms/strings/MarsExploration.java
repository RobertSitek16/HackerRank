/*
Letters in some of SOS messages are altered by cosmic radiation during transmission. Given the
signal received by Earth as string, s, determine how many letters of Sami's SOS have been changed
by radiation.
For example, Earth receives SOSTOT. Sami's original message was SOSSOS. Two of the message
characters were changed in transit.
 */
package practice.problemSolving.algorithms.strings;

import java.util.Scanner;

public class MarsExploration {

    private static int marsExploration(String s) {
        char [] inputString = s.toCharArray();
        char [] sos = {'S', 'O', 'S'};
        int k = 0;
        int n = 0;
        for(int i = 0; i < inputString.length; i++, k++){
            if(k == 3){
                k = 0;
            }
            if(inputString[i] != sos[k]){
                n++;
            }
        }
        return n;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String s = scanner.nextLine();
        int result = marsExploration(s);
        System.out.println(result);

        scanner.close();
    }
}
