/*
You are given an interface AdvancedArithmetic which contains a method signature int divisor_sum(int n).
You need to write a class called MyCalculator which implements the interface.

divisorSum function just takes an integer as input and return the sum of all its divisors. For example
divisors of 6 are 1, 2, 3 and 6, so divisor_sum should return 12. The value of n will be at most 1000.

Read the partially completed code in the editor and complete it. You just need to write the
MyCalculator class only. Your class shouldn't be public.
 */
package practice.java.objectOrientedProgramming.javaInterface;

import java.util.ArrayList;
import java.util.List;

public class MyCalculator implements AdvancedArithmetic {

    @Override
    public int divisior_sum(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                list.add(i);
            }
        }
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        return sum;
    }
}
