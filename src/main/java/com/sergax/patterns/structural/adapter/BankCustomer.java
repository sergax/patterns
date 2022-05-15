package com.sergax.patterns.structural.adapter;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * by Aksenchenko Serhii on 15.05.2022
 *
 * Adapter class!!!
 */

public class BankCustomer extends BankDetails implements CreditCard {

    @SneakyThrows
    @Override
    public void giveBankDetails() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter the account holder name : ");
            String[] name = br.readLine().split(" ");
            String firstName = name[0];
            String lastName = name[1];
            if (name.length > 2) throw new Exception("Too long Name .( , try again ");

            System.out.println("Enter the account number : ");
            long number = Long.parseLong(br.readLine());

            System.out.println("Enter the Bank name : ");
            String bankName = br.readLine();

            setBankName(bankName);
            setAccNumber(number);
            setAccHolderName(firstName + " " + lastName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getCreditCard() {
        long accNumber = getAccNumber();
        String accName = getAccHolderName();
        String bankName = getBankName();

        return "The Account namber : " + accNumber + "\n" +
                "User : " + accName + "\n" +
                "Bank name : " + bankName + "\n" +
                "is valid : ok ";
    }
}
