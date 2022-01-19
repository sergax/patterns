package com.sergax.patterns.creational.abstractFactory.anotherCompony;

import com.sergax.patterns.creational.abstractFactory.SeniorDeveloper;

public class SeniorDeveloperInXCompany implements SeniorDeveloper {
    @Override
    public void writeSeniorCode() {
        System.out.println("I'm Senior and working in company X");
    }
}
