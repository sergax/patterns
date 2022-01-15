package com.sergax.patterns.abstractFactory;

import com.sergax.patterns.abstractFactory.anotherCompony.XTeamFactory;

public class EmployeeFromXCompany {
    public static void main(String[] args) {
        TeamFactory teamFactory = new XTeamFactory();
        JuniorDeveloper juniorDeveloper = teamFactory.getJuniorDeveloper();
        MiddleDeveloper middleDeveloper = teamFactory.getMiddleDeveloper();
        SeniorDeveloper seniorDeveloper = teamFactory.getSeniorDeveloper();

        juniorDeveloper.writeJuniorCode();
        middleDeveloper.writeMiddleCode();
        seniorDeveloper.writeSeniorCode();
    }
}
