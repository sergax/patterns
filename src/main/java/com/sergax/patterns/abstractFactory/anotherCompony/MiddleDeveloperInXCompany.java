package com.sergax.patterns.abstractFactory.anotherCompony;

import com.sergax.patterns.abstractFactory.MiddleDeveloper;

public class MiddleDeveloperInXCompany implements MiddleDeveloper {
    @Override
    public void writeMiddleCode() {
        System.out.println("I'm Middle and working in company X");
    }
}
