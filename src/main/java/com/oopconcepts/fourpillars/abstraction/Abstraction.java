package com.oopconcepts.fourpillars.abstraction;

import com.oopconcepts.fourpillars.Jellyfish;
import com.oopconcepts.fourpillars.SeaCreature;
import com.oopconcepts.fourpillars.Shark;

public class Abstraction {
    /*
Abstraction
Definition: hiding complexity

Layman’s terms:
When you order a pizza, you want to be able to place your order, pay for your purchase, and have it delivered to you.

On the other hand, when you order a pizza, there’s a million things you don’t want to see: the cook making the dough, the tomatoes being picked off the vine and having them turned into tomato sauce, the pizza box being made in the factory. The list goes on.

All you know is that you want a quick and easy transaction so that you can go eat.

This is the process of abstraction. The implementation details and complexity of making the pizza are being hidden from the user.

The same thing occurs in software engineering, and abstraction is one of the 4 fundamental principles of object oriented programming.

Some examples of abstraction are:
-Methods
-Interfaces

Let’s take the example listed in this abstraction package. We have the SeaCreature interface. Both the jellyfish and  shark classes
implement this interface.

Below, on line 47, we create an instance of a SeaCreature, with the concrete type jellyfish. Now we have Jayla the jellyfish.

**Abstraction using methods**
On line 48 when we call the eats() method on Jayla, the compiler prints a statement about what Jayla the jellyfish eats. You don’t see the system.out.print ln() statement included within the method. All you know is that when you call the eats() method,  a statement appears in your compiler. This is an example of abstraction. The implementation details of the eats() method is abstracted away.

**Abstraction using interfaces**
In this example, we created a SeaCreature interface, which has two different concrete types: jellyfish and shark. SeaCreature is an abstraction for these two concrete types. So, when we pass a SeaCreature into a method, we won’t have to specify what the concrete type is. This can keep future code dynamic, as it is almost always better for code to depend on an abstraction.

EXAMPLES IN THE JAVA LIBRARY
substring() method in the String class
Map Interface and List Interface
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
