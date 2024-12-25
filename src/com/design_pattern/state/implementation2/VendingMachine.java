package com.design_pattern.state.implementation2;

import java.util.HashMap;
import java.util.Map;

public class VendingMachine {

    private VendingMachineState currentState;

    private int amountInserted;

    private int totalAmount;

    private int selectedSlot;

    private Map<Integer, Integer> slotToPrice = new HashMap<>();

    public VendingMachine() {

        currentState = new IdleState((this));
        amountInserted = 0;
        totalAmount = 0;

        slotToPrice.put(1, 10);
        slotToPrice.put(2, 20);
        slotToPrice.put(3, 30);
        slotToPrice.put(4, 40);

    }

    public void setState(VendingMachineState state) {
        this.currentState = state;
    }

    public void insertMoney(int amount) {
        System.out.println("Inserted amount:"+amount);
        if(amount< slotToPrice.get(this.selectedSlot)) {
            this.displayMessage("Insufficient amount, insert more money");
            dispenseAmount(amount);
            return;
        }
        this.amountInserted = amount;
        this.currentState.insertMoney(amount);
        dispenseProduct();
        dispenseAmount(this.amountInserted - slotToPrice.get(this.selectedSlot));
    }

    public void selectProduct(int slot) {
        System.out.println("Selected slot:"+slot);
        if(!slotToPrice.containsKey(slot)) {
            this.displayMessage("Invalid slot");
        }
        this.currentState.selectProduct(slot);
    }

    public void dispenseAmount(int amount) {
        System.out.println("Dispensing amount:"+amount);
        totalAmount -= amount;
        amountInserted = 0;
    }

    public void dispenseProduct() {
        this.currentState.dispenseProduct(this.selectedSlot);
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }

    public void setSlot(int slot) {
        this.selectedSlot = slot;
    }

}
