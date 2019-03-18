package com.znlccy.media.index;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(value = "com.znlccy.media.core.mapper")
@ComponentScan(basePackages = {"com.znlccy.media.core.model"})
public class MediaIndexApplication {

    public static void main(String[] args) {
        SpringApplication.run(MediaIndexApplication.class, args);
    }

}
