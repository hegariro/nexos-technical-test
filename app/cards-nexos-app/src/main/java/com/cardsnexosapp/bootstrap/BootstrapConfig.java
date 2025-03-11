package com.cardsnexosapp.bootstrap;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BootstrapConfig {

    @PostConstruct
    public void init() {
        System.out.println("🔹 BootstrapConfig: Aplicación Cards Nexos iniciada correctamente.");
        // Aquí puedes inicializar datos, conexiones u otras configuraciones previas al arranque.
    }
}

