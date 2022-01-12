package com.sergax.patterns.factory;

public class JuniorSpecialistFactory implements UsersFactory {
    @Override
    public  Users createUsers() {
        return new JuniorSpecialist();
    }
}
