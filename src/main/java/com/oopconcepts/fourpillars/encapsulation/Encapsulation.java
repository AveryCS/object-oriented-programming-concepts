package com.oopconcepts.fourpillars.encapsulation;

/*
* Encapsulation

Definition: a way to restrict the direct access to some components of an object

Layman’s terms: In life, there are things that we share with some people and keep private from others. Let’s take a family recipe that has been passed down for generations. Family members have access to the recipe and non-family members don’t. Not to mention, no one has access to the actual copy where they have the ability to erase what great-grandma wrote and change the recipe (not even family members). This is encapsulation as a fundamental principle of object oriented programming : giving the proper amount of access to the proper individual.

EXPLANATION
Encapsulation can be done using access modifiers and keywords. In Java, there are 4 access modifiers:

 Public- can be accessed from anywhere that has access to the package where the class is defined ( refers to variables, methods, and classes)
Private- can only be accessed within the same class ( refers to variables, methods, and classes)
Protected- Can be accessed within the same class and from any subclass (even if the subclass is in a different package). (Refers to variables and methods only)
Default (package private)- can be accessed from anywhere within the package, but not from outside the package. If no modifier is listed, then it will be be package private

To demonstrate encapsulation, let’s use a Vending Machine as an example. There are two fields that are private to the vending machine: how many cans are left in it and how many coins have been inserted in it. In this example, you need 5 coins to purchase one can.

We want the public to be able to:

Add cans to the vending machine
Add coins
Purchase an item

The methods above will be public because this is how users will interact with the vending machine. The private class fields (coins and cans) can only be modified by accessing a public method. This is how encapsulation works.
*
*
*
* */

public class Encapsulation {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();

        machine.purchaseItem();
        machine.addCans();
        machine.addCans();
        machine.purchaseItem();
        machine.addCoins();
        machine.addCoins();
        machine.addCoins();
        machine.purchaseItem();
        machine.addCoins();
        machine.addCoins();
        machine.purchaseItem();
    }
}
