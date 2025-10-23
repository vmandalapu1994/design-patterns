package com.design_pattern.visitor;

import java.util.List;

public class Directory implements FileSystemElement {

    private String name;
    private List<File> files;

    public Directory(String name, List<File> files) {
        this.name = name;
        this.files = files;
    }

    @Override
    public void visit(FileSystemVisitor visitor) {
        visitor.visit(this);
    }

    public String getName() {
        return name;
    }

    public List<File> getFiles() {
        return files;
    }
}
