package com.sergax.patterns.structural.facade;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Kitchen {
    public void cookFood() {
        System.out.println("Cook food");
    }

    public void signalReady() {
        System.out.println("Food is ready");
    }
}
