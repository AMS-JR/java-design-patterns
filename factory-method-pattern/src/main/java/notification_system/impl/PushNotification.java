package notification_system.impl;

import notification_system.Notification;

public class PushNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("PushNotification");
    }
}
