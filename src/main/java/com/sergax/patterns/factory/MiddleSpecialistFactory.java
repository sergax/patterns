package com.sergax.patterns.factory;

public class MiddleSpecialistFactory implements UsersFactory {
    @Override
    public Users createUsers() {
        return new MiddleSpecialist();
    }
}
