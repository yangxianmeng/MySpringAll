package com.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * SpringBoot demo 认识Springboot
 * @author: Yxm
 **/
@RestController
@SpringBootApplication
public class DemoApplication {
    @RequestMapping("/")
    String index() {
        return "hello Spring boot!";
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
