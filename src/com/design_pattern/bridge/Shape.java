package com.design_pattern.bridge;

abstract class Shape {

    protected Renderer renderer;

    public Shape(Renderer renderer) {
        this.renderer = renderer;
    }

    abstract void draw();

}
