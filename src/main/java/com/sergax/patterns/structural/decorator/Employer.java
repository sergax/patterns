package com.sergax.patterns.structural.decorator;

public abstract class Employer {
    String description = "Unknown Company";

    public String getDescription() {
        return description;
    }

    public abstract int getSalary();
}
