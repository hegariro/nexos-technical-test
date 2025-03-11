package com.cardsnexosapp.main_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.cardsnexosapp")
public class CardsNexosApp {
    public static void main(String[] args) {
        SpringApplication.run(CardsNexosApp.class, args);
    }
}

