package com.design_pattern.strategy.implementation2;

public class PaymentClient {


    public static void main(String[] args) {
        CardPayment cardPayment = new CardPayment("3422232332", "Vamsi");

        PaymentProcessor paymentProcessor = new PaymentProcessor(cardPayment);
        paymentProcessor.pay(322321.10);

        paymentProcessor.setPaymentStrategy(new Gpay("322332323323"));
        paymentProcessor.pay(233232.20);

    }

}
