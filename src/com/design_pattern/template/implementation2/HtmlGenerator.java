package com.design_pattern.template.implementation2;

public class HtmlGenerator extends ReportGenerator {

    @Override
    public void gatherData() {
        System.out.println("Gathering data for HTML report");
    }

    @Override
    public void formatData() {
        System.out.println("Formatting data for HTML report");
    }

    @Override
    public void exportData() {
        System.out.println("Exporting data for HTML report");
    }

}
