package practice.java.introduction;

import java.util.Scanner;

public class JavaEndOfFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int line_number = 1;
        while (scanner.hasNext()) {
            System.out.println(line_number + " " + scanner.nextLine());
            line_number++;
        }
        scanner.close();
    }
}
