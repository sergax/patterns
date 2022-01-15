package com.sergax.patterns.creational.singleton;

public class Main {
    public static void main(String[] args) {
        RestController restController = RestController.getInstance();
        System.out.println(restController.getSource("http://google.com"));

        RestController restController1 = RestController.getInstance();
        System.out.println(restController1.getSource("http://github.com"));

        System.out.println("Hash restController: " + restController.hashCode());
        System.out.println("Hash restController1: " + restController1.hashCode());
    }
}