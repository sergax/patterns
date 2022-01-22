package com.sergax.patterns.structural.facade;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Waiter {
    public void takeOrder() {
        System.out.println("Take order from client");
    }

    public void takeOrderToCook() {
        System.out.println("Send order to cook");
    }

    public void serveCustomer() {
        System.out.println("Serve food");
    }
}
