package com.design_pattern.bridge;

public class RasterRenderer implements Renderer {
    @Override
    public void render() {
        System.out.println("Rendered using Raster strategy");
    }
}
