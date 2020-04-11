package com.cx.mylogserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cx.mylogserver")
public class MylogServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MylogServerApplication.class, args);
    }

}
