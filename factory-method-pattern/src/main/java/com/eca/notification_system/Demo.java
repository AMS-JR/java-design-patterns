package com.eca.notification_system;

import com.eca.notification_system.impl.EmailFactory;
import com.eca.notification_system.impl.PushFactory;
import com.eca.notification_system.impl.SMSFactory;

public class Demo {
    public static void main(String[] args){
        NotificationFactory emailNotification = new EmailFactory();
        emailNotification.process();
        NotificationFactory smsNotification = new SMSFactory();
        smsNotification.process();
        NotificationFactory pushNotification = new PushFactory();
        pushNotification.process();
    }
}
