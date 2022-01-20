package com.sergax.patterns.structural.decorator;

public class Manager extends Employee{
    Employer employer;

    public Manager(Employer employer) {
        this.employer = employer;
    }

    @Override
    public String getDescription() {
        return employer.getDescription() + ", Manager";
    }

    @Override
    public int getSalary() {
        return 1500 + employer.getSalary();
    }
}
