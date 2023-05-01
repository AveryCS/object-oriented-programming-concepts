package com.oopconcepts.solidprinciples.D;
/*
* The “D” in SOLID stands for the Dependency Inversion Principle. This means that high level classes should not depend on low level classes; they should both depend on abstractions.

For example, let’s take a look at the garden class. In the garden constructor, it sets the type of flower to a “daisy”. Let’s now go to the “DPrinciple” class, where we create a new instance of a garden. After the garden is created, we print out the type of flower that’s in the garden, and it prints “daisy”.

Because we created this dependency in the constructor, now garden is tightly coupled to the creation of its dependency, flower of the String daisy. Every time we create a garden, it automatically makes it a daisy garden.

In reality, what we’d like to do is create a garden that contains a variety of different types of flowers. The code currently does not give us this flexibility.

The current setup does not adhere to the Dependency Inversion principle because a garden should not be dependent on a type of flower. In order to change this, we should pass in a general flower into the garden constructor. This way, gardens can be filled with all types of flowers, which is ultimately what we want.

*
* */

public class DPrinciple {
    public static void main(String[] args) {
        Garden garden = new Garden();
        System.out.println("Type of flower garden: " + garden.flower.type);
    }
}
