package practice.java.bigNumber;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class JavaBigDecimal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String [] s = new String[n];
        for(int i = 0; i < n; i++){
            s[i] = scanner.next();
        }
        scanner.close();

        //Write your code here
        Arrays.sort(s, Collections.reverseOrder(new Comparator<String>() {
            @Override
            public int compare(String x, String y) {
                BigDecimal a = new BigDecimal(x);
                BigDecimal b = new BigDecimal(y);
                return a.compareTo(b);
            }
        }));

        for(int i = 0; i < n; i++)
        {
            System.out.println(s[i]);
        }
    }
}
