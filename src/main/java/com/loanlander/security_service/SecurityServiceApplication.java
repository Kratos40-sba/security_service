package com.loanlander.security_service;

import com.loanlander.security_service.user.model.User;
import com.loanlander.security_service.user.ripository.UserRipository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecurityServiceApplication implements CommandLineRunner {
    @Autowired
    private  UserRipository userRipository ;


    public static void main(String[] args) {
        SpringApplication.run(SecurityServiceApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        userRipository.save(new User("abdou","123456"));
        userRipository.save(new User("med","123456"));
    }
}
