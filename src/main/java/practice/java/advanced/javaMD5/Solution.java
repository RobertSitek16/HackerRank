/*
Given an alphanumeric string, s, denoting a password, compute and print its MD5 encryption value.
 */
package practice.java.advanced.javaMD5;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws NoSuchAlgorithmException {

        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.reset();
        md.update(password.getBytes());
        byte [] digest = md.digest();
        BigInteger bigInt = new BigInteger(1,digest);
        String hashText = bigInt.toString(16);

        while (hashText.length() < 32){
            hashText = "0" + hashText;
        }

        System.out.println(hashText);
    }
}
