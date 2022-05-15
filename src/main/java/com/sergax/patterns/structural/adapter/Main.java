package com.sergax.patterns.structural.adapter;

/**
 * by Aksenchenko Serhii on 15.05.2022
 */
public class Main {
    public static void main(String[] args) {
        CreditCard creditCard = new BankCustomer();
        creditCard.giveBankDetails();
        System.out.println(creditCard.getCreditCard());
    }
}
