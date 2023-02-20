package org.example;

public class Main {
    public static void main(String[] args) {
        NumberChecker nc = new NumberChecker();
        // warmup
        for (int i = 1; i < 10_000; i++)
            nc.isPrime2(i);
        System.out.println("Warm up finished");

        long startTime = System.currentTimeMillis();
        for (int i = 1; i < 50_000; i++)
            System.out.println(nc.isPrime2(i));
        System.out.println("Time taken: " + (System.currentTimeMillis() - startTime) + " ms");
    }
}