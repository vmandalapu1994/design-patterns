package com.design_pattern.bridge;

public class BridgeDriver {

    public static void main(String[] args) {
        VectorRenderer vectorRenderer = new VectorRenderer();
        Circle circle = new Circle(vectorRenderer);
        circle.draw();

        RasterRenderer rasterRenderer = new RasterRenderer();
        Rectangle rectangle = new Rectangle(rasterRenderer);
        rectangle.draw();
    }

}
