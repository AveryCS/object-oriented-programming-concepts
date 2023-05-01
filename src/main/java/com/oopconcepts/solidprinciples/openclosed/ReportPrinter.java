package com.oopconcepts.solidprinciples.openclosed;

public class ReportPrinter {
    private String type;

    ReportPrinter(String type){
        this.type=type;
    }

    public void print(String type){
        if(type.equalsIgnoreCase("PDF")){
            System.out.println("Your PDF report has printed");
        }else if(type.equalsIgnoreCase("CSV")){
            System.out.println("Your CSV report has printed");
        }else{
            System.out.println("This report format is not supported. Please submit a PDF or CSV file.");
        }

    }
}
