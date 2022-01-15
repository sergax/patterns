package com.sergax.patterns.abstractFactory.anotherCompony;

import com.sergax.patterns.abstractFactory.JuniorDeveloper;

public class JuniorDeveloperInXCompany implements JuniorDeveloper {
    @Override
    public void writeJuniorCode() {
        System.out.println("I'm Junior and working in company X");
    }
}
