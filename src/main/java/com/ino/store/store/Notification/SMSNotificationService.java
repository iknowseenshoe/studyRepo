package com.ino.store.store.Notification;

import org.springframework.stereotype.Service;

@Service("sms")
public class SMSNotificationService implements NotificationService{

    @Override
    public void send(String message, String recipientEmail) {
        System.out.println("SMS");
        System.out.println("Message " + message);
    }
}
