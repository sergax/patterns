package com.sergax.patterns.structural.decorator;

public class Director extends Employee{
    Employer employer;

    public Director(Employer employer) {
        this.employer = employer;
    }

    @Override
    public String getDescription() {
        return employer.getDescription() + ", Director";
    }

    @Override
    public int getSalary() {
        return 3000 + employer.getSalary();
    }
}
