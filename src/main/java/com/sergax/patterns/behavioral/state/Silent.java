package com.sergax.patterns.behavioral.state;

public class Silent implements MobileAlertState {
    @Override
    public void alert(AlertStateContext ctx) {
        System.out.println("silent...");
    }
}
