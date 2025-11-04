package notification_system;

public interface NotificationFactory {
    void process();
    Notification createNotification();
}
