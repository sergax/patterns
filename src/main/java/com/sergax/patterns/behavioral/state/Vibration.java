package com.sergax.patterns.behavioral.state;

public class Vibration implements MobileAlertState {
    @Override
    public void alert(AlertStateContext ctx) {
        System.out.println("vibration...");
    }
}
