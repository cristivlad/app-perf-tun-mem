package org.example;

import org.exploringMemory.Customer;

import java.util.ArrayList;
import java.util.List;

public class TestGarbageCollection {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        while (true) {
            Customer c = new Customer("Matt");
            customers.add(c);

            if (customers.size() > 10_000) {
                for (int i = 0; i < 5_000; i++)
                    customers.remove(0);
            }
        }
    }
}
