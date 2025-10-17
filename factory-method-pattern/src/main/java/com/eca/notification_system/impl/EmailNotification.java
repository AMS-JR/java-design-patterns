package com.eca.notification_system.impl;

import com.eca.notification_system.Notification;

public class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("EmailNotification");
    }
}
