//StoreApplication.java
package com.ino.store.store;
import com.ino.store.store.UserRegistrationService.User;
import com.ino.store.store.UserRegistrationService.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(StoreApplication.class, args);


	}
}
