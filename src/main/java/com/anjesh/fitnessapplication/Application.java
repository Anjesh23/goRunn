package com.anjesh.fitnessapplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        }
//    @Bean
//    CommandLineRunner runner(){
//        return args -> {
//            run r = new run(1,"First Run", LocalDateTime.now(), LocalDateTime.now().plusHours(1),4, Location.OUTDOOR);
//            log.info("Run: {}", r);
//        };
//    }


}
