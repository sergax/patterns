package com.sergax.patterns.creational.factory;

public class SeniorSpecialist implements Users {
    @Override
    public void showInformationAboutUsers() {
        System.out.println(
                "This is a senior : " +
                        "id = 3 ; " +
                        "name = Senior ; "
        );
    }
}
