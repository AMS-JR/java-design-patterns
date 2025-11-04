package main.java.notification_system;

public interface NotificationFactory {
    void process(String message);
    Notification createNotification();
}
