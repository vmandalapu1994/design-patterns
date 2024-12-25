package com.design_pattern.state.implementation2;

public interface VendingMachineState {

    void insertMoney(int amount);

    void selectProduct(int slot);

    void dispenseProduct(int slot);

}
