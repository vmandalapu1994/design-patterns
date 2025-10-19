package com.design_pattern.bridge;

public class VectorRenderer implements Renderer {

    @Override
    public void render() {
        System.out.println("Rendered using VECTOR strategy");
    }

}
