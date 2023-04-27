package com.oopconcepts.fourpillars;

import com.oopconcepts.fourpillars.SeaCreature;

public class Shark implements SeaCreature {
    private String name;

    public Shark(String name){
        this.name = name;
    }
    public Shark(){};


    @Override
    public void eats() {
        System.out.println("My name is " + name + ". I am a shark and I eat smaller fish and invertebrates.");
    }

    @Override
    public void attack() {
        System.out.println("My name is " + name + ". I am a shark and I attack my prey with my teeth. ");

    }

    @Override
    public boolean camouflage() {
        System.out.println("Hi, I'm " + name + ". Since I'm a shark, I'm unable to camouflage.");
        return false;
    }

    @Override
    public String name(){
        return name;
    }


}
