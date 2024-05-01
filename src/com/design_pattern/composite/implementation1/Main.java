package com.design_pattern.composite.implementation1;

public class Main {

    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        Drawing shapeComposite = new Drawing();
        shapeComposite.add(c);
        shapeComposite.add(r);
        shapeComposite.draw();
    }

}
