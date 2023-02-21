package org.example;

public class NumberChecker {
    public Boolean isPrime(Integer testNumber) {
        for (Integer i = 2; i < testNumber; i++) {
            if (testNumber % i == 0) return false;
        }
        return true;
    }

    public Boolean isPrimeImproved(int testNumber) {
        int maxToCheck = (int)Math.sqrt(testNumber);
        for (int i = 2; i<= maxToCheck; i++)
            if (testNumber % i == 0)
                return false;
        return true;
    }
}
