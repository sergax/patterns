package com.sergax.patterns.creational.factory;

public class JuniorSpecialistFactory implements UsersFactory {
    @Override
    public  Users createUsers() {
        return new JuniorSpecialist();
    }
}
