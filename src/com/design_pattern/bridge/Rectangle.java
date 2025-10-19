package com.design_pattern.bridge;

public class Rectangle extends Shape {

    public Rectangle(Renderer renderer) {
        super(renderer);
    }

    @Override
    void draw() {
        System.out.println("Drawing rectangle");
        renderer.render();
    }
}
