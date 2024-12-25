package com.design_pattern.state.implementation2;

public class IdleState implements VendingMachineState {

    private final VendingMachine vendingMachine;

    public IdleState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertMoney(int amount) {
        this.vendingMachine.displayMessage("Select the product first");
    }

    @Override
    public void selectProduct(int slot) {
        this.vendingMachine.setSlot(slot);
        this.vendingMachine.setState(new ProductSelectedState(this.vendingMachine));
    }

    @Override
    public void dispenseProduct(int slot) {
        this.vendingMachine.displayMessage("Select the product first");
    }


}
