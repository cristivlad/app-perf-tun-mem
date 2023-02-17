package org.escapingReferences;


import org.exploringMemory.Customer;
import org.exploringMemory.ReadOnlyCustomer;

import java.util.Iterator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        CustomerRecords records = new CustomerRecords();

        records.addCustomer(new Customer("John"));
        records.addCustomer(new Customer("Simon"));

//        records.getCustomers().clear();
//        records.find("John").setName("Jane");
        ReadOnlyCustomer c = records.find("John");
        Customer customer = (Customer) c;
        customer.setName("Jane");

//        for (Customer next : records.getCustomers().values()) {
        for (Customer next : records) {
            System.out.println(next);
        }

//        Iterator<Customer> it = records.iterator();
//        it.next();
//        it.remove();
//        for (Customer next : records) {
//            System.out.println(next);
//        }
    }
}
