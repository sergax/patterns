package com.sergax.patterns.creational.builder;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CivilEngineer {
    private HouseBuilder houseBuilder;

    public House getHouse()
    {
        return this.houseBuilder.getHouse();
    }

    public void constructHouse()
    {
        this.houseBuilder.buildBasement();
        this.houseBuilder.buildStructure();
        this.houseBuilder.buildRoof();
        this.houseBuilder.buildInterior();
    }
}
