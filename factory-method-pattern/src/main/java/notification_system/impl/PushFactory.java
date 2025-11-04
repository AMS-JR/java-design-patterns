package notification_system.impl;

import notification_system.Notification;
import notification_system.NotificationFactory;

public class PushFactory implements NotificationFactory {
    @Override
    public void process() {
        Notification notification = this.createNotification();
        notification.notifyUser();
    }

    @Override
    public Notification createNotification() {
        return new PushNotification();
    }
}
