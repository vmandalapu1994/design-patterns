package com.design_pattern.flyweight.implementation2;

public class Forest {

    private TreeTypeFactory treeTypeFactory;

    public Forest() {
        this.treeTypeFactory = new TreeTypeFactory();
    }

    public void plantTree(String name, String color, String texture, int posX, int posY) {
        TreeType treeType = this.treeTypeFactory.getTreeType(name, color, texture);
        Tree tree = new Tree(posX, posY, treeType);
        tree.plant();
    }
}
