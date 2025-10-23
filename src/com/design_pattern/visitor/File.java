package com.design_pattern.visitor;

public class File implements FileSystemElement {

    private String name;
    private int sizeInKb;

    public File(String name, int sizeInKb) {
        this.name = name;
        this.sizeInKb = sizeInKb;
    }

    @Override
    public void visit(FileSystemVisitor visitor) {
        visitor.visit(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSizeInKb() {
        return sizeInKb;
    }

    public void setSizeInKb(int sizeInKb) {
        this.sizeInKb = sizeInKb;
    }
}
