package com.design_pattern.flyweight.implementation1;

public class FontImpl implements Font {

    private String name;

    public FontImpl(String name) {
        this.name = name;
    }

    @Override
    public void render(String text) {
        System.out.println("Rendering " + text + " using font " + name);
    }

}
