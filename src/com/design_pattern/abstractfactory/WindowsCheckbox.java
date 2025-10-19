package com.design_pattern.abstractfactory;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Painting windows checkbox");
    }

    @Override
    public void select() {
        System.out.println("Selected windows checkbox");
    }
}
