package com.eca.notification_system.impl;

import com.eca.notification_system.Notification;

public class SMSNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("SMSNotification");
    }
}
