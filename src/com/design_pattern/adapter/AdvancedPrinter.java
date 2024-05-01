package com.design_pattern.adapter;

public class AdvancedPrinter implements Printer {

    private final LegacyPrinter legacyPrinter;

    public AdvancedPrinter() {
        this.legacyPrinter = new LegacyPrinter();
    }

    @Override
    public void print(String doc) {
        legacyPrinter.printDocument(doc);
    }
}
