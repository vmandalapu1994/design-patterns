package com.design_pattern.decorator.implementation1;

public class SugarDecorator implements Coffee {

    private Coffee coffee;


    public SugarDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " + sugar";
    }

    @Override
    public double getCost() {
        return 4;
    }
}
