package com.design_pattern.template.implementation1;

public class Coffee extends Beverage {

    @Override
    protected void addCondiments() {
        System.out.println("Add sugar and milk");
    }

    @Override
    protected void brew() {
        System.out.println("Brewing coffee");
    }

    protected boolean customerWantsCondiments() {
        return false;
    }

}
