//InMemoryUserRepository.java
package com.ino.store.store.UserRegistrationService;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
@Repository
public class InMemoryUserRepository implements UserRepository {
    private final HashMap<String, User> userHashMap = new HashMap<>();

    @Override
    public void save(User user) {
        System.out.println("Saving user " + user);
        userHashMap.put(user.getEmail(), user);
    }

    @Override
    public User findByEmail(String email) {
        return userHashMap.getOrDefault(email, null);
    }
}

