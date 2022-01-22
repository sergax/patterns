package com.sergax.patterns.structural.facade;

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
