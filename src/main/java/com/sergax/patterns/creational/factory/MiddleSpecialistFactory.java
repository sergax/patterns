package com.sergax.patterns.creational.factory;

public class MiddleSpecialistFactory implements UsersFactory {
    @Override
    public Users createUsers() {
        return new MiddleSpecialist();
    }
}
