package notification_system.impl;

import notification_system.Notification;

public class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("EmailNotification");
    }
}
