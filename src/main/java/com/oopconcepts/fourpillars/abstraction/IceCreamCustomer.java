package com.oopconcepts.fourpillars.abstraction;

public class IceCreamCustomer implements FoodCustomer{
    String customerName;

    IceCreamCustomer(String customerName){
        this.customerName = customerName;
    }

    @Override
    public void purchaseFood() {
        System.out.println( customerName +" just purchased Ice cream.");
    }

    @Override
    public void eat() {
        System.out.println(customerName + "is enjoying the ice cream");
    }
}
