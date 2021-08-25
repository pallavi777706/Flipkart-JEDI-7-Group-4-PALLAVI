package com.flipkart.array;

import com.flipkart.bean.Customer;

public class DemoArray {
    public static void main(String[] args) {
        // primitive
        int arrayOfInt[] = new int[] {2, 3, 5};
        for (int i = 0; i < arrayOfInt.length; i++) {
            System.out.println("The " + i + " element has value  : " + arrayOfInt[i]);
        }
        char arrayOfChars[] = new char[] {'c', 'r', '1'};
        for (int i = 0; i < arrayOfChars.length; i++) {
            System.out.println("The " + i + " element has value  : " + arrayOfChars[i]);
        }
        // Wrapper class array
        String names[] = new String[] {"Shakir", "Priyanka", "Sumeet"};

        for (int i = 0; i < names.length; i++) {
            System.out.println("The " + i + " name is : " + names[i]);
        }

        String departmentNames[] = new String[5];

        departmentNames[0] = "Accounts";
        departmentNames[1] = "H.R.";
        departmentNames[2] = "I.T";
        departmentNames[3] = "P.R.";
        departmentNames[4] = "Sales";
        // new style of for loop
        for (String department : departmentNames) {
            System.out.println(department);
        }

        // custom array
        Customer myCustomers[] = new Customer[] {new Customer(), new Customer(), new Customer()};
        myCustomers[0].setCustomerID(101);
        myCustomers[0].setCustomerName("IBM");

        myCustomers[1].setCustomerID(102);
        myCustomers[1].setCustomerName("3I-Infotech");

        myCustomers[2].setCustomerID(103);
        myCustomers[2].setCustomerName("Info Sys");

        for (Customer customer:myCustomers) {
            System.out.println(customer.getCustomerID() + " : " + customer.getCustomerName());
        }

    }
}
