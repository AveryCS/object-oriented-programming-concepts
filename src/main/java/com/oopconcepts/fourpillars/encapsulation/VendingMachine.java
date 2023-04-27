package com.oopconcepts.fourpillars.encapsulation;

public class VendingMachine {
    private int coins;
    private int cans;

    VendingMachine(){
        this.coins =0;
        this.cans =0;
    }

    public void addCans(){
      cans++;

    }
    public void addCoins(){
        coins++;

    }
    public void purchaseItem(){
        if(cans <1){
            System.out.println("No cans available. Please add more cans.");
            System.out.println();
        }else if(coins<5){
            System.out.println("Please add more money to purchase an item. You need "+(5-coins) +" more coins to make a purchase.");
            System.out.println();
        }else{
            System.out.println("Purchase successful!");
            System.out.println();
            cans--;
            coins-=5;
        }

    }
}
