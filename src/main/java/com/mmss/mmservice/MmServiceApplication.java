package com.mmss.mmservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.mmss.mmservice.dao")
public class MmServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MmServiceApplication.class, args);
    }

}
