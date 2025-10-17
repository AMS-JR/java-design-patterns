package com.eca.notification_system.impl;

import com.eca.notification_system.Notification;

public class PushNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("PushNotification");
    }
}
