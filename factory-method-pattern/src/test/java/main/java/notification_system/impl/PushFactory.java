package main.java.notification_system.impl;

import main.java.notification_system.Notification;
import main.java.notification_system.NotificationFactory;

public class PushFactory implements NotificationFactory {
    @Override
    public void process(String message) {
        Notification notification = this.createNotification();
        notification.notifyUser(message);
    }

    @Override
    public Notification createNotification() {
        return new PushNotification();
    }
}
