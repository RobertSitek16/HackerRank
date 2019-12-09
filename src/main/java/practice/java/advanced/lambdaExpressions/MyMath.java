/*
This Java 8 challenge tests your knowledge of Lambda expressions!

Write the following methods that return a lambda expression performing a specified action:

PerformOperation isOdd(): The lambda expression must return true if a number is odd or false if it is even.
PerformOperation isPrime(): The lambda expression must return true if a number is prime or false if it is composite.
PerformOperation isPalindrome(): The lambda expression must return  true if a number is a palindrome or false if it is not.
 */
package practice.java.advanced.lambdaExpressions;

public class MyMath {
    public static boolean checker(PerformOperation p, int num){
        return p.check(num);
    }

    public PerformOperation isOdd() {
        return a -> (a % 2 != 0);
    }

    public PerformOperation isPrime() {
        return a -> (java.math.BigInteger.valueOf(a).isProbablePrime(1));
    }

    public PerformOperation isPalindrome() {
        return a -> (Integer.toString(a).equals(new StringBuilder(Integer.toString(a)).reverse().toString()));
    }
}
