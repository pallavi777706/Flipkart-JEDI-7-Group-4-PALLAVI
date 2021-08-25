package com.flipkart.demoabstract;

public class Main {
    public static void main(String[] args) {
        NewTestinheritAbstract obj = new NewTestinheritAbstract();
        System.out.println(obj.nonImplemented());
        System.out.println(obj.demoChild());
        TestAbstract obj1 = new TestAbstract() {
            @Override
            public String nonImplemented() {
                return null;
            }
        };
    }
}
