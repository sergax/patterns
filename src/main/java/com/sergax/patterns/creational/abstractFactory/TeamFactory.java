package com.sergax.patterns.creational.abstractFactory;

public interface TeamFactory {
    JuniorDeveloper getJuniorDeveloper();
    MiddleDeveloper getMiddleDeveloper();
    SeniorDeveloper getSeniorDeveloper();
}
