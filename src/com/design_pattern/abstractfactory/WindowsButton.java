package com.design_pattern.abstractfactory;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Painting a windows button");
    }

    @Override
    public void select() {
        System.out.println("Window button is selected");
    }
}
