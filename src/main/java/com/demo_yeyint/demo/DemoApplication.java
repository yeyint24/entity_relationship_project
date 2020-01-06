package com.demo_yeyint.demo;

import com.demo_yeyint.demo.service.IDatabase;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    private final IDatabase iDatabase;

    public DemoApplication(IDatabase iDatabase) {
        this.iDatabase = iDatabase;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
    @Bean
    public CommandLineRunner runner(){
        return args -> {
            iDatabase.createTables();
        };
    }

}
