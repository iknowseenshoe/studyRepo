//UserService.java
package com.ino.store.store.UserRegistrationService;

import com.ino.store.store.Notification.NotificationService;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final NotificationService notificationService;

    public UserService(UserRepository userRepository, NotificationService notificationService) {
        this.userRepository = userRepository;
        this.notificationService = notificationService;
    }

    public void registerUser(User user){
        if (userRepository.findByEmail(user.getEmail()) != null){
            throw new IllegalArgumentException("User with email " + user.getEmail() + " already exists");

        }

        userRepository.save(user);
        notificationService.send("You registered successfully", user.getEmail());
    }
}

