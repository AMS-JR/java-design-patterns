package notification_system.impl;

import notification_system.Notification;
import notification_system.NotificationFactory;

public class SMSFactory implements NotificationFactory {
    @Override
    public void process() {
        Notification notification = this.createNotification();
        notification.notifyUser();
    }

    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }
}
