package com.flipkart.demoabstract;

public class NewTestinheritAbstract extends TestAbstract{

    @Override
    public String nonImplemented() {
        return "hi from child class nonImplemented method";
    }
    public String demoChild() {
        return "Child abstract demo";
    }
}
