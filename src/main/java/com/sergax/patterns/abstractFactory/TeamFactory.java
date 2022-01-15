package com.sergax.patterns.abstractFactory;

public interface TeamFactory {
    JuniorDeveloper getJuniorDeveloper();
    MiddleDeveloper getMiddleDeveloper();
    SeniorDeveloper getSeniorDeveloper();
}
