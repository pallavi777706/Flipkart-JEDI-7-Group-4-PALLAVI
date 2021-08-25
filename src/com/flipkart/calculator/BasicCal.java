package com.flipkart.calculator;

/**
 * 4 non static methods
 *
 */
public class BasicCal {
    //non static methods
    public int add(int a, int b) {
        return a+b;
    }
    public int subtract(int a, int b) {
        return a-b;
    }
    public int multiply(int a, int b) {
        return a*b;
    }
    public int divide(int a, int b) {
        return a/b;
    }
    //static methods
    public static String calName() {
        return "This is a normal calculator";
    }
}
