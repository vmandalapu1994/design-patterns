package com.design_pattern.visitor;

public interface FileSystemVisitor {
    void visit(File file);

    void visit(Directory directory);
}
