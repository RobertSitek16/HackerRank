/*
You will be given two integers x and y as input, you have to compute x/y. If x and y are not 32
bit signed integers or if y is zero, exception will occur and you have to report it. Read sample
Input/Output to know what to report in case of exceptions.
 */
package practice.java.exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingTryCatch {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        try {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.println(x/y);
        } catch (InputMismatchException e1){
            System.out.println(e1.getClass().getName());
        } catch (ArithmeticException e2){
            System.out.println(e2);
        }
    }
}
