package com.design_pattern.visitor;

import java.util.List;

public class Driver {

    public static void main(String[] args) {
        File file1 = new File("file1", 10);
        File file2 = new File("file2", 23);
        File file3 = new File("file3", 45);
        File file4 = new File("file3", 26);

        Directory directory = new Directory("Dir1", List.of(file1, file2, file3));
        SizeVisitor sizeVisitor = new SizeVisitor();
        directory.visit(sizeVisitor);
        file4.visit(sizeVisitor);
    }

}
