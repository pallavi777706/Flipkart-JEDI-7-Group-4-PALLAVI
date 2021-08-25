package com.flipkart.bean;

public class Customer {
    private int customerID;
    private String customerName;
    private String customerAddress;

    public Customer() {

    }

    public Customer(String customerName, String customerAddress, int customerID) {
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerID = customerID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }
}
