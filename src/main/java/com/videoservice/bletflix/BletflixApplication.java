package com.videoservice.bletflix;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BletflixApplication {
    @Autowired


    public static void main(String[] args) {
        SpringApplication.run(BletflixApplication.class, args);
    }

}
