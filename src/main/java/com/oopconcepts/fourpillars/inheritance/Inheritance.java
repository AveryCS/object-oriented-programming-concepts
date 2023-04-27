package com.oopconcepts.fourpillars.inheritance;

import com.oopconcepts.fourpillars.SeaCreature;
/*
*
* INHERITANCE

Definition: the mechanism of basing an object or class upon another object or class, retaining similar implementation

Layman’s terms:
Inheritance is when a subclass extends a superclass or when a class or interface implements an interface. When a subclass extends a superclass, all of the methods and class fields from the superclass get inherited by the subclass. Extending a class can help eliminate having to re-write code.

Additionally, when you implement an interface, a class or interface is inheriting the method signatures of the abstract methods.

EXAMPLE
Let’s take a look at the  Hammerhead class. The only class field is a boolean hasHammerShapedHead, and is set equal to true because this will be true for all hammerheads. We’ve also created a public getter in order to retrieve this class field.

Now, let’s take a look at the example below. An instance of Hammerhead hammond is created.

When we call the getter for hasHammerShapedHead, it prints what we expect.

When we call .camouflage() , .attack(), and .eats() on the instance of Hammond the Hammerhead, we also have statements to print that were not included in the hammerhead class.

Why is that? This is because of inheritance. The Hammerhead class extends the Shark class. The Shark class implemented the SeaCreature interface.

Because the Hammerhead class is a subclass of Shark, it now inherits all of the methods that come along with Shark. This is the reason why we did not have to re-write all of the methods in the hammerhead class. As an additional note, we can also treat Hammond as a SeaCreature, a Shark, or a HammerHead. See polymorphism package for a more detailed explanation of this concept.

EXAMPLE IN THE JAVA LIBRARY
Comparator Interface
List Interface

* */

public class Inheritance {
    public static void main(String[] args) {

        Hammerhead hammond = new Hammerhead("Hammond");

        System.out.println("Do I have a hammerhead? Answer: "+ hammond.getHasHammerShapedHead());
         hammond.camouflage();
         hammond.attack();
         hammond.eats();
    }

}
