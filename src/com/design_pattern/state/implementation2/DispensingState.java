package com.design_pattern.state.implementation2;

public class DispensingState implements VendingMachineState {

    private final VendingMachine vendingMachine;

    public DispensingState(VendingMachine vendingMachine) {
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
        System.out.println("Dispensing product at slot:"+slot);
        this.vendingMachine.setState(new IdleState(this.vendingMachine));
    }
}
