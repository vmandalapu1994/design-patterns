package com.design_pattern.facade;

public class OrderFacade {

    private final InventorySystem inventorySystem;
    private final PaymentSystem paymentSystem;
    private final NotificationSystem notificationSystem;

    public OrderFacade(InventorySystem inventorySystem, PaymentSystem paymentSystem,
                       NotificationSystem notificationSystem) {
        this.inventorySystem = inventorySystem;
        this.paymentSystem = paymentSystem;
        this.notificationSystem = notificationSystem;
    }

    public void placeOrder(String productId, Double amount, String email) {
        if (!inventorySystem.isProductAvailable(productId)) {
            System.out.println("Order failed: product not available");
        }
        if (!paymentSystem.makePayment(amount)) {
            System.out.println("Order failed: payment failed");
        }
        inventorySystem.reserveProduct(productId);
        notificationSystem.sendNotification(email, "Order successfully placed");
    }

}
