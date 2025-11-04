package main.java.notification_system;

import main.java.notification_system.impl.EmailFactory;
import main.java.notification_system.impl.PushFactory;
import main.java.notification_system.impl.SMSFactory;

public class NotificationApplication {
    public static void main(String[] args){
        NotificationFactory emailNotification = new EmailFactory();
        emailNotification.process("Your order has been shipped!");
        NotificationFactory smsNotification = new SMSFactory();
        smsNotification.process("Your OTP is 12345");
        NotificationFactory pushNotification = new PushFactory();
        pushNotification.process("You have a new friend request");
    }
}
