package com.oopconcepts.solidprinciples.dependencyinversion;

public class Garden {

    Flower flower;

    Garden(){
        this.flower = new Flower("Daisy");
    }
}
