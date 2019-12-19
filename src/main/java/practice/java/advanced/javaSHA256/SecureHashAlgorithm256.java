/*
Given a string, s, print its SHA-256 hash value.
 */
package practice.java.advanced.javaSHA256;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class SecureHashAlgorithm256 {

    public static void main(String [] args) throws NoSuchAlgorithmException {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.reset();
        md.update(password.getBytes());
        byte [] digest = md.digest();
        BigInteger bigInt = new BigInteger(1,digest);
        String hashText = bigInt.toString(16);

        while (hashText.length() < 64){
            hashText = "0" + hashText;
        }

        System.out.println(hashText);
    }
}
