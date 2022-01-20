package com.sergax.patterns.structural.decorator;

public class Main {
    public static void main(String[] args) {
        Employer employer = new Epam();
        System.out.println(employer.getDescription() + " Salary : " + employer.getSalary());

        Employer employer1 = new Kernel();
        employer1 = new Specialist(employer1);
        employer1 = new Manager(employer1);
        System.out.println(employer1.getDescription() + " Salary : " + employer1.getSalary());
    }
}
