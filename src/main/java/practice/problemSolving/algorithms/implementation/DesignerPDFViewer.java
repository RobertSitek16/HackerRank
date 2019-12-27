/*
Complete the DesignerPdfViewer function in the editor below. It should return an integer representing the size of the
highlighted area.

DesignerPdfViewer has the following parameter(s):

h: an array of integers representing the heights of each letter
word: a string

 */
package practice.problemSolving.algorithms.implementation;

import java.util.Scanner;

public class DesignerPDFViewer {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int [] heights = new int[26];
        for (int i = 0; i < heights.length; i++){
            heights[i] = scanner.nextInt();
        }

        String word = scanner.next();
        scanner.close();

        int maxHeight = 0;

        for (int i = 0; i < word.length(); i++){
            maxHeight = Math.max(maxHeight, heights[(int)word.charAt(i) - (int)'a']);
        }

        int result = word.length() * maxHeight;
        System.out.println(result);
    }
}
