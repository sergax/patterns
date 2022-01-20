package com.sergax.patterns.structural.decorator;

public class Kernel extends Employer {
    public Kernel() {
        description = "Kernel";
    }
    @Override
    public int getSalary() {
        return 500;
    }
}
