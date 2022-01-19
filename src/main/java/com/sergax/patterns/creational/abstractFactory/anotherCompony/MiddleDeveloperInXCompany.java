package com.sergax.patterns.creational.abstractFactory.anotherCompony;

import com.sergax.patterns.creational.abstractFactory.MiddleDeveloper;

public class MiddleDeveloperInXCompany implements MiddleDeveloper {
    @Override
    public void writeMiddleCode() {
        System.out.println("I'm Middle and working in company X");
    }
}
