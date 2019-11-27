package practice.java.bigNumber;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaPrimeNumber {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        BigInteger nCheck = scanner.nextBigInteger();
        scanner.close();
        System.out.println(nCheck.isProbablePrime(1) ? "prime" : "not prime");
    }
}
