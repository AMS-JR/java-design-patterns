package com.eca.notification_system.impl;

import com.eca.notification_system.Notification;
import com.eca.notification_system.NotificationFactory;

public class EmailFactory implements NotificationFactory {
    @Override
    public void process() {
        Notification notification = this.createNotification();
        notification.notifyUser();
    }

    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}
