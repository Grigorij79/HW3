package org.example;

public class SumCalculator {
    public int sum(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Input should be > 0");
        }

        int rezult = 0;
        for (int i = 1; i <= n; i++) {
            rezult += i;

            if (rezult < 0 ) {
                throw new IllegalArgumentException("Input " + n + " to big");
            }
        }

        return rezult;
    }

}
