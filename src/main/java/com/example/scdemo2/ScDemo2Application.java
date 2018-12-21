package com.example.scdemo2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.scdemo2.dao.*")
public class ScDemo2Application {

    public static void main(String[] args) {
        SpringApplication.run(ScDemo2Application.class, args);
    }

}

