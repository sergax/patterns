package com.sergax.patterns.structural.decorator;

public class Epam extends Employer {
    public Epam() {
        description = "Epam";
    }
    @Override
    public int getSalary() {
        return 1000;
    }
}
