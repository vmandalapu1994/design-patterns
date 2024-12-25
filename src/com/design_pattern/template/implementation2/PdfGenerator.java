package com.design_pattern.template.implementation2;

public class PdfGenerator extends ReportGenerator {

    @Override
    public void gatherData() {
        System.out.println("Gathering data for PDF report");
    }

    @Override
    public void formatData() {
        System.out.println("Gathering data for PDF report");
    }

    @Override
    public void exportData() {
        System.out.println("Gathering data for PDF report");
    }

}
