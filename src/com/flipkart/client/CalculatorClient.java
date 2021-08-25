package com.flipkart.client;

import com.flipkart.calculator.BasicCal;
import com.flipkart.calculator.ScientificCal;

public class CalculatorClient {

    public static void main(String[] args) {
        // instance of the class
//        BasicCal calculator = new BasicCal();
        ScientificCal cal = new ScientificCal();
        System.out.println(cal.add(5,4));
        System.out.println(cal.subtract(5,4));
        System.out.println(cal.multiply(2,4));
        System.out.println(cal.divide(8,4));
        //called the static method
        System.out.println(BasicCal.calName());
        System.out.println(cal.sinCal(90));


    }

}
