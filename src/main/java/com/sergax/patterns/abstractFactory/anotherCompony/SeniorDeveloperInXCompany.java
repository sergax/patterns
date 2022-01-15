package com.sergax.patterns.abstractFactory.anotherCompony;

import com.sergax.patterns.abstractFactory.SeniorDeveloper;

public class SeniorDeveloperInXCompany implements SeniorDeveloper {
    @Override
    public void writeSeniorCode() {
        System.out.println("I'm Senior and working in company X");
    }
}
