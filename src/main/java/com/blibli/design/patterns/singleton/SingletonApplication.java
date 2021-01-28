package com.blibli.design.patterns.singleton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

public class SingletonApplication {

    @SpringBootApplication
    public static class Configuration {
        @Bean
        public Contoh contoh(){
            Contoh contoh = new Contoh();
            contoh.name = "adi";
            return contoh;
        }
    }

    public static class Contoh{
        public String name;
    }

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SingletonApplication.Configuration.class);

        Contoh contoh1 = context.getBean(Contoh.class);
        System.out.println(contoh1.name);
        Contoh contoh2 = context.getBean(Contoh.class);

//        Contoh contoh1 = new Contoh();
//        Contoh contoh2 = contoh1;

        System.out.println(contoh1 == contoh2);
    }
}
