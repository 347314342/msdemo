package com.huki.msdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.huki.msdemo.mapper")
public class MsdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsdemoApplication.class, args);
    }

}
