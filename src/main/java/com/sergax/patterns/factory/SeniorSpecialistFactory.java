package com.sergax.patterns.factory;

public class SeniorSpecialistFactory implements UsersFactory {
    @Override
    public Users createUsers() {
        return new SeniorSpecialist();
    }
}
