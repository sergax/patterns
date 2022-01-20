package com.sergax.patterns.structural.adapter;

public class PlasticToyDuck implements ToyDuck{
    @Override
    public void squeak() {
        System.out.println("Squeak");
    }
}
