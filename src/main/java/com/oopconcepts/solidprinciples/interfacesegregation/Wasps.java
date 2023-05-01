package com.oopconcepts.solidprinciples.interfacesegregation;

public class Wasps implements Insect {
    @Override
    public void sting() {
        System.out.println("I'm a wasp and I sting");
    }

    @Override
    public void eat() {


    }

    @Override
    public void reproduce() {

    }
}
