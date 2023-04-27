package com.oopconcepts.fourpillars.polymorphism;
import java.util.*;
/*
*Polymorphism
Definition: the ability of one object or type to take on many forms

Layman’s terms: Let’s use individuals as an example. For example, I am one person but take on the forms of sister, daughter, wife, cousin, etc.

Just remember, one thing in many forms.

Polymorphism can be seen in anything that is a superclass, such as an interface, abstract class, or super class.

Let’s take our SeaCreature interface, for example. The SeaCreature is an interface and can take on the form of both a shark and a jellyfish. This is an example of polymorphism. One SeaCreature in many forms.

Below, a list that holds the type SeaCreature is created. Notice that it can hold both jellyfish and sharks.
*
* EXAMPLE IN THE JAVA LIBRARY
The Object class is the ultimate superclass because every single concrete class in Java extends the Object class.

*
* */

import com.oopconcepts.fourpillars.Jellyfish;
import com.oopconcepts.fourpillars.SeaCreature;
import com.oopconcepts.fourpillars.Shark;

public class Polymorphism {
    public static void main(String[] args) {

        SeaCreature sally = new Jellyfish("Sally");
        SeaCreature sam = new Shark("Sam");
        SeaCreature josh = new Jellyfish("Josh");
        SeaCreature shaunie = new Shark("Shaunie");

        List<SeaCreature> creatureList = List.of(sally, sam, josh, shaunie);

        for(SeaCreature s: creatureList){
            System.out.println(s.name());
        }
    }
}
