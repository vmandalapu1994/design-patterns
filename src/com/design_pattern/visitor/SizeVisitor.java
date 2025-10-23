package com.design_pattern.visitor;

public class SizeVisitor implements FileSystemVisitor {

    @Override
    public void visit(File file) {
        int totalSizeInKbs = file.getSizeInKb();
        System.out.println("Total size(KBs):" + totalSizeInKbs);
    }

    @Override
    public void visit(Directory directory) {
        int totalSizeInKbs = 0;
        for (File file : directory.getFiles()) {
            totalSizeInKbs += file.getSizeInKb();
        }
        System.out.println("Total size(KBs):" + totalSizeInKbs);
    }

}
