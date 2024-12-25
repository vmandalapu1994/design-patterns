package com.design_pattern.state.implementation2;

public class ProductSelectedState implements VendingMachineState {

    private final VendingMachine vendingMachine;

    public ProductSelectedState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertMoney(int amount) {
        this.vendingMachine.setState(new MoneyInsertedState(this.vendingMachine));
    }

    @Override
    public void selectProduct(int slot) {
        this.vendingMachine.displayMessage("Product already selected");
    }

    @Override
    public void dispenseProduct(int slot) {

    }

}
