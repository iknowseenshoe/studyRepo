    package com.ino.store.store.Notification;

    import org.springframework.context.annotation.Primary;
    import org.springframework.stereotype.Service;

    @Service
    @Primary
    public class NotificationManager {
        private final NotificationService notificationService;

        public NotificationManager(NotificationService notificationService){
            this.notificationService = notificationService;
        }

        public void sendNotification(String message, String recipientEmail){
            notificationService.send(message, recipientEmail);
        }
    }
