package com.design_pattern.bridge;

public class Circle extends Shape {

    public Circle(Renderer renderer) {
        super(renderer);
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle");
        renderer.render();
    }
}
