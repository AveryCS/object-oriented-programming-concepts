package com.oopconcepts.fourpillars.abstraction;

import com.oopconcepts.fourpillars.Jellyfish;
import com.oopconcepts.fourpillars.SeaCreature;
import com.oopconcepts.fourpillars.Shark;

public class Abstraction {

    /*
    * Layman’s terms:
When you order a pizza, you want to be able to place your order, pay for your purchase, and have it delivered to you.

On the other hand, when you order a pizza, there’s a million things you don’t want to see: the cook making the dough, the tomatoes being picked off the vine and having them turned into tomato sauce, the pizza box being made in the factory, the list goes on.

All you know is that you want a quick and easy transaction so that you can go eat.

This is the process of abstraction. The implementation details and complexity of making the pizza are being hidden from the user.

The same thing occurs in software engineering, and abstraction is one of the 4 fundamental principles of object oriented programming.

Some examples of abstraction are:
-Methods
-Interfaces

    *
    * */

    public static void main(String[] args) {
        SeaCreature jayla = new Jellyfish("Jayla");
        jayla.eats();
        jayla.attack();
        jayla.camouflage();

        System.out.println("__________________________________________________________________________");

        SeaCreature sharla = new Shark("Sharla");
        sharla.eats();
        sharla.attack();
        sharla.camouflage();
    }
}
