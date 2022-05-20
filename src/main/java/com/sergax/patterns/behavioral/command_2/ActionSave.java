package com.sergax.patterns.behavioral.command_2;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ActionSave implements ActionListenerCommand {
    private Document doc;

    @Override
    public void execute() {
        doc.save();
    }
}
