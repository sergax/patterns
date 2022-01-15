package com.sergax.patterns.creational.factory;

public class SeniorSpecialistFactory implements UsersFactory {
    @Override
    public Users createUsers() {
        return new SeniorSpecialist();
    }
}
