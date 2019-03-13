package com.znlccy.media.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.znlccy.media.core.mapper")
@ComponentScan(basePackages = {"com.znlccy.media.core"})
public class MediaAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(MediaAdminApplication.class, args);
    }

}
