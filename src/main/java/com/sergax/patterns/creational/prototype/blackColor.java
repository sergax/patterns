package com.sergax.patterns.creational.prototype;

public class blackColor extends Color {
    public blackColor() {
        this.colorName = "black";
    }

    @Override
    void addColor() {
        System.out.println("Black color added");
    }
}
