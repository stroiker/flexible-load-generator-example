package me.stroiker.flexibleloadgenerator.example;

import me.stroiker.flexibleloadgenerator.api.LoadGeneratorAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@LoadGeneratorAutoConfiguration
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
