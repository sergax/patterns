package com.sergax.patterns.creational.builder;

public class Builder {
    public static void main(String[] args) {
        HouseBuilder newHouseBuilder = new NewHouseBuilder();
        HouseBuilder tipBuilder = new TipiHouseBuilder();
        CivilEngineer engineer = new CivilEngineer(tipBuilder);

        engineer.constructHouse();

        House house = engineer.getHouse();

        System.out.println("Builder constructed: "+ house);
    }
}
