package com.solt.demo;

import com.solt.demo.service.IDatabase;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.beans.BeanProperty;

@SpringBootApplication
public class DemoApplication {
    private final IDatabase database;

    public DemoApplication(IDatabase database) {
        this.database = database;
    }


    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner runner(){
        return result -> {
            database.createTable();

        };
    }
}
