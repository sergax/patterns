package com.sergax.patterns.behavioral.chain;

public class Main {
    public static void main(String[] args) {
        Chain chain = new Chain();

        //Calling chain of responsibility
        chain.process(new Number(40));
        chain.process(new Number(-50));
        chain.process(new Number(0));
        chain.process(new Number(91));
    }
}
