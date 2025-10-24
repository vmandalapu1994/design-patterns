package com.design_pattern.facade;

public class NotificationSystem {

    public void sendNotification(String email, String message) {
        System.out.printf("Sent the notification: %s to the email:%s", message, email);
    }

}
