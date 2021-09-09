package com.xy.personalphoto;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(basePackages = "com.xy.personalphoto.dao")
@ComponentScan(basePackages = {"com.xy.personalphoto.controller","com.xy.personalphoto.service"})
public class PersonalphotoApplication {

    public static void main(String[] args) {
        SpringApplication.run(PersonalphotoApplication.class, args);
    }

}
