package com.oopconcepts.fourpillars;

public class Jellyfish implements SeaCreature {

    private String name;

   public Jellyfish(String name){
        this.name =name;
    }

    @Override
    public void eats() {
        System.out.println("My name is " + name + ".I am a jellyfish and I eat plankton.");

    }

    @Override
    public void attack() {
        System.out.println("My name is " + name + ". I am a jellyfish and I wrap my tentacles around my prey.");

    }

    @Override
    public boolean camouflage() {
        System.out.println("Hi, I'm " + name + ". Since I'm a jellyfish, I have great camouflage skills.");
        return true;
    }
    @Override
    public String name(){
       return name;
    }
}
