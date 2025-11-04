package notification_system.impl;

import notification_system.Notification;

public class SMSNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("SMSNotification");
    }
}
