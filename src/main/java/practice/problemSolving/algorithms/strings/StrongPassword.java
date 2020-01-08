/*
Louise joined a social networking site to stay in touch with her friends. The signup page required her to input a name and a
password. However, the password must be strong. The website considers a password to be strong if it satisfies the following
criteria:

- Its length is at least 6.
- It contains at least one digit.
- It contains at least one lowercase English character.
- It contains at least one uppercase English character.
- It contains at least one special character. The special characters are: !@#$%^&*()-+
 */
package practice.problemSolving.algorithms.strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrongPassword {

    private static int minimumNumber(int n, String password) {

        Pattern patternNumbers = Pattern.compile("(\\d)");
        Pattern patternLowerCase = Pattern.compile("([A-Z])");
        Pattern patternUpperCase = Pattern.compile("([a-z])");
        Pattern patternSpecialCharacters = Pattern.compile("(\\W)");

        Matcher matcherNumber = patternNumbers.matcher(password);
        Matcher matcherLowerCase = patternLowerCase.matcher(password);
        Matcher matcherUpperCase = patternUpperCase.matcher(password);
        Matcher matcherSpecialCharacters = patternSpecialCharacters.matcher(password);

        int count = 0;

        if (!matcherNumber.find()){
            count++;
        }
        if (!matcherLowerCase.find()) {
            count++;
        }
        if (!matcherUpperCase.find()) {
            count++;
        }
        if (!matcherSpecialCharacters.find()) {
            count++;
        }

        int lengthDifference = 6 - password.length();

        if (lengthDifference > 0 && count <= lengthDifference){
            return lengthDifference;
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        String password = scanner.next();
        int answer = minimumNumber(n, password);
        scanner.close();
        System.out.println(answer);
    }
}
