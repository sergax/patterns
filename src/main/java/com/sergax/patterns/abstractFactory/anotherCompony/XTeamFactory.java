package com.sergax.patterns.abstractFactory.anotherCompony;

import com.sergax.patterns.abstractFactory.JuniorDeveloper;
import com.sergax.patterns.abstractFactory.MiddleDeveloper;
import com.sergax.patterns.abstractFactory.SeniorDeveloper;
import com.sergax.patterns.abstractFactory.TeamFactory;

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
