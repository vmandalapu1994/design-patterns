package com.design_pattern.template.implementation1;

public abstract class Beverage {

    void brewBeverage() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }

    }

    protected boolean customerWantsCondiments() {
        return true;
    }

    protected abstract void addCondiments();

    private void pourInCup() {
        System.out.println("Pouring in cup");
    }

    protected abstract void brew();

    private void boilWater() {
        System.out.println("Boiling water");
    }

}
