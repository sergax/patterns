package com.sergax.patterns.creational.abstractFactory.anotherCompony;

import com.sergax.patterns.creational.abstractFactory.JuniorDeveloper;

public class JuniorDeveloperInXCompany implements JuniorDeveloper {
    @Override
    public void writeJuniorCode() {
        System.out.println("I'm Junior and working in company X");
    }
}
