package com;

import com.springboot.bean.config.TestConfigBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * SpringBoot demo 认识Springboot
 * @author: Yxm
 **/
@SpringBootApplication
@EnableConfigurationProperties({TestConfigBean.class})
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(DemoApplication.class);
        app.setAddCommandLineProperties(false);
        app.run(args);
    }
}
