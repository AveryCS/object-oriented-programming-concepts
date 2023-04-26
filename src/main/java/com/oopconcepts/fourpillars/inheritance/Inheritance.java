package com.oopconcepts.fourpillars.inheritance;

import com.oopconcepts.fourpillars.SeaCreature;

import java.sql.SQLOutput;

public class Inheritance {
    public static void main(String[] args) {

        Hammerhead hammond = new Hammerhead("Hammond");

        System.out.println("Do I have a hammerhead? Answer: "+ hammond.getHasHammerShapedHead());
    }

}
