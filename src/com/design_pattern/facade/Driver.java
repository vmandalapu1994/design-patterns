package com.design_pattern.facade;

public class Driver {

    public static void main(String[] args) {
        InventorySystem inventorySystem = new InventorySystem();
        PaymentSystem paymentSystem = new PaymentSystem();
        NotificationSystem notificationSystem = new NotificationSystem();
        OrderFacade orderFacade = new OrderFacade(inventorySystem, paymentSystem, notificationSystem);
        orderFacade.placeOrder("123", 2345.3, "vmandalapu12@gmail.com");
    }

}
