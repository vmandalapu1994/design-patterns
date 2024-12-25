package com.design_pattern.strategy.implementation2;

import javax.swing.text.GapContent;

public class Gpay implements PaymentStrategy {

    private String phoneNumber;


    public Gpay(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paying amount:" + amount + " using Gpay");
    }
}
