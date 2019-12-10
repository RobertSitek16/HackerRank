package practice.java.advanced.primeChecker;

public class Prime {
    public void checkPrime(int...arguments) {
        for (int i : arguments) {
            if (isPrime(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    boolean isPrime(int n){
        if (n < 2) {
            return false;
        } else if (n == 2) {
            return true;
        } else if (n % 2 == 0) {
            return false;
        }
        int sqrt = (int) Math.sqrt(n);
        for (int i = 3; i <= sqrt; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
