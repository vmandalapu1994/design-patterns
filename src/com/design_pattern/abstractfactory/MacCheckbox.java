package com.design_pattern.abstractfactory;

public class MacCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Painting Mac checkbox");
    }

    @Override
    public void select() {
        System.out.println("Mac checkbox is selected");
    }
}
