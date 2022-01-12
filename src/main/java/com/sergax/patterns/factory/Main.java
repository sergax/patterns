package com.sergax.patterns.factory;

import lombok.SneakyThrows;

public class Main {

    public static void main(String[] args) {
        UsersFactory usersFactory = createUser("Junior");
        Users users = usersFactory.createUsers();
        users.showInformationAboutUsers();
    }

    @SneakyThrows
    static UsersFactory createUser(String user) {
        return switch (user) {
            case "Junior" -> new JuniorSpecialistFactory();
            case "Middle" -> new MiddleSpecialistFactory();
            case "Senior" -> new SeniorSpecialistFactory();
            default -> throw new Exception(user + " this specialist isn't existing");
        };
    }
}
