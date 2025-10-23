package com.design_pattern.flyweight.implementation2;

public class Tree {
    private int posX;
    private int posY;
    private TreeType treeType;

    public Tree(int posX, int posY, TreeType treeType) {
        this.posX = posX;
        this.posY = posY;
        this.treeType = treeType;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public TreeType getTreeType() {
        return treeType;
    }

    public void setTreeType(TreeType treeType) {
        this.treeType = treeType;
    }

    public void plant() {
        System.out.printf("Planted the %s tree at positionX: %s and positionY: %s%n", this.treeType.getName(), this.posX, this.posY);
    }
}
