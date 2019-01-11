package com.ls.shares;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * @Desciption
 * @Author hp
 * @Date 2018/12/2615:04
 **/

@SpringBootApplication
@ServletComponentScan
@MapperScan("com.ls.shares.system.mapper")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
