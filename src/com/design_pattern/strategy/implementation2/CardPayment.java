package com.design_pattern.strategy.implementation2;

import javax.smartcardio.Card;

public class CardPayment implements PaymentStrategy {

    private String cardNumber;

    private String name;

    public CardPayment(String cardNumber, String name) {
        this.cardNumber = cardNumber;
        this.name = name;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paying the amount:+"+amount+" using card payment");

    }
}
