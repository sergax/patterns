package com.sergax.patterns.behavioral.command_2;

import lombok.AllArgsConstructor;

import javax.print.Doc;
@AllArgsConstructor
public class MenuOptions {
    private final ActionListenerCommand actionListenerCommandOpen;
    private final ActionListenerCommand actionListenerCommandSave;

    public void clickOpen() {
        actionListenerCommandOpen.execute();
    }

    public void clickSave() {
        actionListenerCommandSave.execute();
    }
}
