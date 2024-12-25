package com.design_pattern.state.implementation2;

public class Main {


    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.selectProduct(1);
        vendingMachine.insertMoney(100);
    }

}
