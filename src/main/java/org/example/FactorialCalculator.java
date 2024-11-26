package org.example;

import java.util.ArrayList;
import java.util.List;

public class FactorialCalculator {
    public List<Long> calculateFactorials(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("(n > 0).");
        }

        List<Long> factorials = new ArrayList<>(n);
        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
            factorials.add(factorial);
        }

        return factorials;
    }
}
