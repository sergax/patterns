package com.sergax.patterns.structural.facade;

public class Main {
    public static void main(String[] args) {
        Kitchen kitchen = new Kitchen();
        Waiter waiter = new Waiter();
        OrderFacade orderFacade = new OrderFacade(kitchen, waiter);
        orderFacade.orderFood();
    }
}
