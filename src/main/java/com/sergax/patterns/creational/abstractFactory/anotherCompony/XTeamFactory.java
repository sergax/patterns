package com.sergax.patterns.creational.abstractFactory.anotherCompony;

import com.sergax.patterns.creational.abstractFactory.JuniorDeveloper;
import com.sergax.patterns.creational.abstractFactory.MiddleDeveloper;
import com.sergax.patterns.creational.abstractFactory.SeniorDeveloper;
import com.sergax.patterns.creational.abstractFactory.TeamFactory;

public class XTeamFactory implements TeamFactory {
    @Override
    public JuniorDeveloper getJuniorDeveloper() {
        return new JuniorDeveloperInXCompany();
    }

    @Override
    public MiddleDeveloper getMiddleDeveloper() {
        return new MiddleDeveloperInXCompany();
    }

    @Override
    public SeniorDeveloper getSeniorDeveloper() {
        return new SeniorDeveloperInXCompany();
    }
}
