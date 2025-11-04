package main.java.notification_system.impl;

import main.java.notification_system.Notification;

public class SMSNotification implements Notification {
    @Override
    public void notifyUser(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
