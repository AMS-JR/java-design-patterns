package main.java.notification_system.impl;

import main.java.notification_system.Notification;

public class PushNotification implements Notification {
    @Override
    public void notifyUser(String message) {
        System.out.println("Sending Push: " + message);
    }
}
