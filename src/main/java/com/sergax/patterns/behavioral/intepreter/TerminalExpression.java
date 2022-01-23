package com.sergax.patterns.behavioral.intepreter;

public class TerminalExpression implements Expression {
    String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    public boolean interpreter(String con) {
        if (con.contains(data)) {
            return true;
        } else {
            return false;
        }
    }
}
