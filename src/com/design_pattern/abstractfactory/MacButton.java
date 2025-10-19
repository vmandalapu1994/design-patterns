package com.design_pattern.abstractfactory;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Painting Mac button");
    }

    @Override
    public void select() {
        System.out.println("Selected Mac button");
    }
}
