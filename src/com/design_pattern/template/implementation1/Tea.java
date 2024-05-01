package com.design_pattern.template.implementation1;

public class Tea extends Beverage {

    @Override
    protected void addCondiments() {
        System.out.println("Add milk");
    }

    @Override
    protected void brew() {
        System.out.println("Brewing tea..");
    }

}
