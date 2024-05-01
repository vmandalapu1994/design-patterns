package com.design_pattern.decorator.implementation1;

public class Main {

    public static void main(String[] args) {
        Coffee simpleCoffee = new SimpleCoffee();
        SugarDecorator sugarDecorator = new SugarDecorator(simpleCoffee);
        System.out.println(sugarDecorator.getDescription());
        System.out.println(sugarDecorator.getCost());

        MilkDecorator milkDecorator = new MilkDecorator(sugarDecorator);
        System.out.println(milkDecorator.getDescription());
        System.out.println(milkDecorator.getCost());
    }

}
