package com.flipkart.application;

import com.flipkart.bean.Customer;
import com.flipkart.business.CustomerBusiness;

public class CustomerApplication {

    public static void main(String[] args) {
        CustomerBusiness customerHandler = new CustomerBusiness();
        customerHandler.createCustomer("cust1", "addr1", 101);
        customerHandler.createCustomer("cust2", "addr2", 102);
        customerHandler.createCustomer("cust3", "addr4", 103);
        printCustomer(customerHandler.listCustomer());
        customerHandler.updateCustomer(103, "cust3", "addr3");
        customerHandler.deleteCustomer(102);
        printCustomer(customerHandler.listCustomer());
        customerHandler.deleteCustomer(103);
        printCustomer(customerHandler.listCustomer());
        customerHandler.deleteCustomer(101);
        printCustomer(customerHandler.listCustomer());


    }

    static void printCustomer(Customer[] customers) {
        for (Customer customer : customers) {
            System.out.println(customer.getCustomerID() + ": " + customer.getCustomerName() + " (" + customer.getCustomerAddress() + ")");
        }
    }

}
