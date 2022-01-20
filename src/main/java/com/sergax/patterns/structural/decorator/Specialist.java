package com.sergax.patterns.structural.decorator;

public class Specialist extends Employee {
    Employer employer;

    public Specialist(Employer employer) {
        this.employer = employer;
    }

    @Override
    public String getDescription() {
        return employer.getDescription() + ", Specialist";
    }

    @Override
    public int getSalary() {
        return 800 + employer.getSalary();
    }
}
