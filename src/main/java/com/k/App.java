package com.k;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class App {

    public static void main(String... args) {
        SpringApplication.run(App.class, args);
    }

    public App(UserRepository userRepository) {
        UserRole roleAdmin = new UserRole();
        roleAdmin.setName("ADMIN");

        User user = new User();
        user.setEmail("test");
        user.setPassword("test");
        user.setRoles(Arrays.asList(roleAdmin));

        userRepository.save(user);

        System.out.println(userRepository.findAll().iterator().next().getEmail());

    }
}
