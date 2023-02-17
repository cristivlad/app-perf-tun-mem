package org.exploringMemory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int localValue = 5;
        // pass by value - localValue var will not be changed
        calculate(localValue);
        System.out.println(localValue);

        Customer c = new Customer("Sally");
        renameCustomer(c);
        System.out.println(c.getName());
    }

    public static void calculate(int calcValue) {
        calcValue = calcValue * 100;
    }

    public static void renameCustomer(Customer cust) {
        cust.setName("Diane");
    }
}
