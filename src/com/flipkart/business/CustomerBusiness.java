package com.flipkart.business;

import com.flipkart.bean.Customer;

import java.util.ArrayList;
import java.util.Iterator;

public class CustomerBusiness {

    private Customer[] customers;

    public CustomerBusiness() {
//        customers = new ArrayList<>();
        customers = new Customer[]{};
    }

    public void createCustomer(String name, String address, int id) {
        Customer customer = new Customer(name, address, id);
        Customer[] newCustomers = new Customer[customers.length + 1];
        for(int i = 0; i < customers.length; i++) {
            newCustomers[i] = customers[i];
        }
        newCustomers[customers.length] = customer;
        customers = newCustomers;
    }

    public Customer[] listCustomer() {
        return customers;
    }

    public void deleteCustomer(int id) {
        int count = 0;
        for(Customer customer : customers) {
            if(customer.getCustomerID() == id) {
                count++;
            }
        }
        Customer[] newCustomers = new Customer[customers.length - count];
        int i = 0;
        for(Customer customer : customers) {
            if(customer.getCustomerID() != id) {
                newCustomers[i++] = customer;
            }
        }
        customers = newCustomers;
//        Iterator<Customer> iterator = customers.iterator();
//        while (iterator.hasNext()) {
//            Customer customer = (Customer) iterator.next();
//            if (customer.getCustomerID() == id) {
//                iterator.remove();
//            }
//        }
    }

    public void updateCustomer(int id, String name, String address) {
        for (Customer customer : customers) {
            if (customer.getCustomerID() == id) {
                customer.setCustomerName(name);
                customer.setCustomerAddress(address);
            }
        }
    }

}
