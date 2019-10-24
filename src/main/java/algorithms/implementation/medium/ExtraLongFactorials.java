package algorithms.implementation.medium;

import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorials {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of long factorial");
        int n;

        do {
            try {
                n = scanner.nextInt();
                if (n < 1 || n > 100) {
                    throw new IllegalArgumentException();
                }
            } catch (IllegalArgumentException e) {
                System.out.println("The number must be greater than 0 and less than 101");
                n = scanner.nextInt();
            }
            System.out.println("The number must be greater than 0 and less than 101");
        } while (n < 1 || n > 100);

        int i = 1;
        BigInteger result = BigInteger.valueOf(1);

        while (i <= n) {
            result = result.multiply(BigInteger.valueOf(i));
            i++;
        }
        System.out.println("The factorial of " + n + " is: " + result.toString());
    }
}
