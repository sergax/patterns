package com.sergax.patterns.factory;

public class JuniorSpecialist implements Users{

    @Override
    public void showInformationAboutUsers() {
        System.out.println(
                "This is a junior : " +
                        "id = 1 ; " +
                        "name = Junior ; "
        );
    }
}
