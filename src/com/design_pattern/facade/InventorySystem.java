package com.design_pattern.facade;

public class InventorySystem {

    public boolean isProductAvailable(String productId) {
        System.out.printf("Checking product %s availability%n", productId);
        return true;
    }

    public void reserveProduct(String productId) {
        System.out.printf("Reserving the product %s%n", productId);
    }

}
