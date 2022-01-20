package com.sergax.patterns.structural.adapter;

class BirdAdapter implements ToyDuck{
    Bird bird;
    public BirdAdapter(Bird bird) {
        // we need reference to the object we
        // are adapting
        this.bird = bird;
    }
    @Override
    public void squeak() {
        bird.makeSound();
    }
}
