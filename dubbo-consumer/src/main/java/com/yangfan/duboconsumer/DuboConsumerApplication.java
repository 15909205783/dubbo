package com.yangfan.duboconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:consumer.xml")
public class DuboConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DuboConsumerApplication.class, args);
    }

}
