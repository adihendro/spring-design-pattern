package com.blibli.design.patterns.adapter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

public class AdapterApplication {

    public static class MyUpHealthIndicator implements HealthIndicator {

        @Override
        public Health health() {
            // logic
            return Health.up().build();
        }
    }

    public static class MyDownHealthIndicator implements HealthIndicator {

        @Override
        public Health health() {
            // logic
            return Health.down().build();
        }
    }

    @SpringBootApplication
    public static class Application {

        @Bean
        public MyUpHealthIndicator myHealthIndicator(){
            return new MyUpHealthIndicator();
        }

        @Bean
        public MyDownHealthIndicator myDownHealthIndicator(){
            return new MyDownHealthIndicator();
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

}
