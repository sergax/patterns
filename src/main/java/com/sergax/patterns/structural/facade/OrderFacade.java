package com.sergax.patterns.structural.facade;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class OrderFacade {
    private Kitchen kitchen;
    private Waiter waiter;

    public void orderFood() {
        waiter.takeOrder();
        waiter.takeOrderToCook();
        kitchen.cookFood();
        kitchen.signalReady();
        waiter.serveCustomer();
    }
}
