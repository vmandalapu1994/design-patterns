package com.design_pattern.composite.implementation1;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape {

    private List<Shape> shapes = new ArrayList<>();

    public void add(Shape shape) {
        shapes.add(shape);
    }

    @Override
    public void draw() {
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
