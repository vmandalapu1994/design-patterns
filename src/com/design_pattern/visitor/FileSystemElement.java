package com.design_pattern.visitor;

public interface FileSystemElement {

    void visit(FileSystemVisitor visitor);

}
