package com.design_pattern.facade;

public class PaymentSystem {

    public boolean makePayment(Double amount) {
        System.out.printf("Making the payment of %f%n", amount);
        return true;
    }

}
