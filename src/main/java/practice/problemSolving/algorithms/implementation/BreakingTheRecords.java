/*
Maria plays college basketball and wants to go pro. Each season she maintains a record of her play. She tabulates the
number of times she breaks her season record for most points and least points in a game. Points scored in the first game
establish her record for the season, and she begins counting from there.

Given Maria's scores for a season, find and print the number of times she breaks her records for most and least points
scored during the season.
 */
package practice.problemSolving.algorithms.implementation;

import java.util.Scanner;

public class BreakingTheRecords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int counterHighest = 0;
        int counterLowest = 0;
        int[] scoreArray = new int[n];
        for (int i = 0; i < n; i++){
            scoreArray [i] = scanner.nextInt();
        }
        int highestScore = scoreArray[0];
        int lowestScore = scoreArray[0];
        for (int i = 0; i < n; i++){
            if (highestScore < scoreArray[i]){
                highestScore = scoreArray[i];
                counterHighest++;
            }
            if (lowestScore > scoreArray[i]){
                lowestScore = scoreArray[i];
                counterLowest++;
            }
        }
        System.out.println(counterHighest + " " + counterLowest);
    }
}
