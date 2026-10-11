package com.grupo4.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerGrupo4Application {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerGrupo4Application.class, args);
    }
}