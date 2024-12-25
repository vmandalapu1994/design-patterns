package com.design_pattern.template.implementation2;

public class TemplateMethodDemo {


    public static void main(String[] args) {
        ReportGenerator htmlReportGenerator = new HtmlGenerator();
        htmlReportGenerator.generateReport();

        ReportGenerator pdfReportGenerator = new PdfGenerator();
        pdfReportGenerator.generateReport();
    }

}
