//UserRepository.java
package com.ino.store.store.UserRegistrationService;

public interface UserRepository {
    void save (User user);
    User findByEmail(String email);
}
