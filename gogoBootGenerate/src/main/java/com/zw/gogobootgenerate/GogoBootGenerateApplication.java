package com.zw.gogobootgenerate;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zw.gogobootgenerate.mapper")
public class GogoBootGenerateApplication {

    public static void main(String[] args) {
        SpringApplication.run(GogoBootGenerateApplication.class, args);
    }

}
