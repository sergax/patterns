package com.sergax.patterns.structural.decorator;

public class McDonalds extends Employer{
    public McDonalds() {
        description = "McDonalds";
    }
    @Override
    public int getSalary() {
        return 600;
    }
}
