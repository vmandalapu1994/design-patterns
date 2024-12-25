package com.design_pattern.template.implementation2;

public abstract class ReportGenerator {

    public final void generateReport() {
        gatherData();
        formatData();
        exportData();
    }

    public abstract void gatherData();

    public abstract void formatData();

    public abstract void exportData();

}
