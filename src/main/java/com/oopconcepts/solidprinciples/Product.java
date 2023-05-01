package com.oopconcepts.solidprinciples;

public class Product {
    private String name;
    private int price;
    private double weight;


    Product(String name, int price, double weight){
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public double calculateShipping(Product product, double weight, String destination, int numberOfUnits){
        //return the shipping cost based on the weight of the product and it's destination
        return 200.00;
    }

    public double calculateProfitMargin(Product product, int numberOfUnitsSold, double pricePerUnit, double TotalExpenses){
        //return the profit margin of the product based on the revenue  minus the expenses
        return 200.00;
    }

}
