package com.sergax.patterns.creational.factory;

public class MiddleSpecialist implements Users {

    @Override
    public void showInformationAboutUsers() {
        System.out.println(
                "This is a middle : " +
                        "id = 2 ; " +
                        "name = Middle ; "
        );
    }
}
