package com.design_pattern.state.implementation2;

public class MoneyInsertedState implements VendingMachineState {

    private final VendingMachine vendingMachine;

    public MoneyInsertedState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertMoney(int amount) {
        this.vendingMachine.displayMessage("Money already inserted");
    }

    @Override
    public void selectProduct(int slot) {
        this.vendingMachine.displayMessage("Product already selected");
    }

    @Override
    public void dispenseProduct(int slot) {
        this.vendingMachine.setState(new DispensingState(this.vendingMachine));
    }


}
